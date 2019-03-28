package com.pandora.common.base;

import java.io.Serializable;
import java.util.Date;

import org.apache.lucene.document.Field;

import com.pandora.common.Header;
import com.pandora.common.enums.EMailType;
import com.pepper.spring.annotation.PepperField;
import com.pepper.spring.enums.EDataType;

import static cn.com.lemon.base.DateUtil.format;

/**
 * {@code Email} The java base class for email service
 * 
 * @author shaobo shih
 * @version 1.0
 */
public class Email extends Header implements Serializable {
	private static final long serialVersionUID = 1L;
	@PepperField(key = "DateTime", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	// Date format required:yyyyMMddhhmmss,default now date
	private String dateTime = format(new Date(), "yyyyMMddhhmmss");
	@PepperField(key = "MailType", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.ENUM)
	private EMailType mailType = EMailType.Default;// default other

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public EMailType getMailType() {
		return mailType;
	}

	public void setMailType(EMailType mailType) {
		this.mailType = mailType;
	}

}
