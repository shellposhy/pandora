package com.pandora.common.base;

import java.util.Date;

import org.apache.lucene.document.Field;

import com.pandora.common.Header;
import com.pandora.common.enums.EClientType;
import com.pepper.spring.annotation.PepperField;
import com.pepper.spring.enums.EDataType;

import static cn.com.lemon.base.DateUtil.format;

/**
 * {@code Log} The java base class for log service
 * 
 * @author shaobo shih
 * @version 1.0
 */
public class Log extends Header {
	private static final long serialVersionUID = 1L;
	@PepperField(key = "APPID", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String appId;
	@PepperField(key = "Version", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String version;
	@PepperField(key = "DateTime", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	// Date format required:yyyyMMddhhmmss,default now date
	private String dateTime = format(new Date(), "yyyyMMddhhmmss");
	@PepperField(key = "ClientType", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.ENUM)
	private EClientType clientType = EClientType.Other;// default other

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public EClientType getClientType() {
		return clientType;
	}

	public void setClientType(EClientType clientType) {
		this.clientType = clientType;
	}

}
