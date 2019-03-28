package com.pandora.common;

import org.apache.lucene.document.Field;

import com.pepper.spring.annotation.PepperField;
import com.pepper.spring.base.BaseEntity;
import com.pepper.spring.enums.EDataType;

/**
 * Header {@code Header} information for Interface or data request
 * 
 * @author shaobo shih
 * @version 1.0
 */
public class Header extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@PepperField(key = "RequestID", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String requestId;// Request id
	@PepperField(key = "RequestIP", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String requestIp;// Request ip
	@PepperField(key = "Sign", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String sign;// Signature result string
	@PepperField(key = "SignType", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String signType;// Signature method, (hmac-sha1)
	@PepperField(key = "SignVersion", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String signVersion;// Signature algorithm version,(1.0)
	@PepperField(key = "Token", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String token;// token
	@PepperField(key = "AccessKey", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String accessKey;// public key

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestIp() {
		return requestIp;
	}

	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getSignVersion() {
		return signVersion;
	}

	public void setSignVersion(String signVersion) {
		this.signVersion = signVersion;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

}
