package com.pandora.common.email.support;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;

import static com.pandora.common.util.ISO8601Times.iso8601time;
import static com.pandora.common.util.URLs.percentEncode;
import static com.pandora.common.util.Crypts.signHmacSHA1;

import com.pandora.common.email.AliEmailSender;
import com.pandora.common.email.model.AliEmail;
import com.pandora.common.util.URLs;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class SimpleAliEmailSender implements AliEmailSender {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(URLs.class);

	@Override
	public void send(final AliEmail email, final String accessKey, final String accessSecret) {
		final Map<String, Object> map = new HashMap<String, Object>();
		map.put("Action", email.getAction());
		map.put("Format", "JSON");
		map.put("Version", "2015-11-23");
		map.put("AccessKeyId", accessKey);
		map.put("SignatureMethod", "HMAC-SHA1");
		map.put("Timestamp", iso8601time(new Date()));
		map.put("SignatureVersion", "1.0");
		map.put("SignatureNonce", String.valueOf(System.currentTimeMillis()));
		map.put("AccountName", email.getAccountName());
		map.put("FromAlias", email.getFromAlias());
		map.put("ReplyToAddress", "true");
		map.put("AddressType", "1");
		map.put("ToAddress", email.getToAddress());
		map.put("Subject", email.getSubject());
		map.put("HtmlBody", email.getHtmlBody());
		final String[] sortedKeys = map.keySet().toArray(new String[] {});
		Arrays.sort(sortedKeys);
		final StringBuilder canonicalizedQueryString = new StringBuilder();
		try {
			for (String key : sortedKeys) {
				canonicalizedQueryString.append("&").append(percentEncode(key)).append("=")
						.append(percentEncode(map.get(key).toString()));
			}
			final StringBuffer stringToSign = new StringBuffer();
			stringToSign.append("POST");
			stringToSign.append("&");
			stringToSign.append(percentEncode("/"));
			stringToSign.append("&");
			stringToSign.append(percentEncode(canonicalizedQueryString.toString().substring(1)));
			map.put("Signature", signHmacSHA1(stringToSign.toString(), accessSecret + "&"));
		} catch (UnsupportedEncodingException exp) {
			throw new RuntimeException("UTF-8 encoding is not supported.");
		}
		final HttpResponse response = HttpRequest.post("https://dm.aliyuncs.com").form(map).send();
		LOGGER.debug(response.bodyText());
		response.close();
	}

}
