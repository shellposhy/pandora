package com.pandora.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.slf4j.LoggerFactory;

/**
 * URL utilities.
 *
 * @author shaobo shih
 * @version 1.0
 */
public final class URLs {

	/**
	 * Logger.
	 */
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(URLs.class);

	/**
	 * Encodes the specified URL.
	 *
	 * @param url
	 *            the specified URL
	 * @return encoded URL
	 */
	public static String encode(final String url) {
		String ret = url;
		try {
			ret = URLEncoder.encode(url, "UTF-8");
		} catch (final Exception e) {
			e.printStackTrace();
			LOGGER.error("Encodes URL [" + url + "] failed");
		}
		return ret;
	}

	public static String percentEncode(final String value) throws UnsupportedEncodingException{
		return value != null ? encode(value).replace("+", "%20").replace("*", "%2A").replace("%7E", "~") : null;
	}

	/**
	 * Private constructor.
	 */
	private URLs() {
	}
}
