package com.pandora.common.email.model;

import org.apache.lucene.document.Field;

import com.pandora.common.base.Email;
import com.pepper.spring.annotation.Pepper;
import com.pepper.spring.annotation.PepperField;
import com.pepper.spring.enums.EDataType;

@Pepper(value = AliEmail.class, path = "/mail")
public class AliEmail extends Email {
	private static final long serialVersionUID = 1L;
	@PepperField(key = "SingleSend", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String action = "SingleSendMail";
	@PepperField(key = "SenderAccount", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String accountName;
	private boolean replyToAddress = true;
	private Integer addressType = 1;
	@PepperField(key = "SenderNickname", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String fromAlias;
	@PepperField(key = "ReceiverAccount", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String toAddress;
	@PepperField(key = "Title", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String subject;
	private String htmlBody;
	private String textBody;
	private String clickTrace = "0";

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public boolean isReplyToAddress() {
		return replyToAddress;
	}

	public void setReplyToAddress(boolean replyToAddress) {
		this.replyToAddress = replyToAddress;
	}

	public Integer getAddressType() {
		return addressType;
	}

	public void setAddressType(Integer addressType) {
		this.addressType = addressType;
	}

	public String getFromAlias() {
		return fromAlias;
	}

	public void setFromAlias(String fromAlias) {
		this.fromAlias = fromAlias;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getHtmlBody() {
		return htmlBody;
	}

	public void setHtmlBody(String htmlBody) {
		this.htmlBody = htmlBody;
	}

	public String getTextBody() {
		return textBody;
	}

	public void setTextBody(String textBody) {
		this.textBody = textBody;
	}

	public String getClickTrace() {
		return clickTrace;
	}

	public void setClickTrace(String clickTrace) {
		this.clickTrace = clickTrace;
	}

}
