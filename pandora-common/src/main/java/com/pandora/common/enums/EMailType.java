package com.pandora.common.enums;

/**
 * {@code Log} type enumeration
 * 
 * @author shaobo shih
 * @version 1.0
 */
public enum EMailType {
	Default("默认邮件"), Register("注册邮件"), Password("修改/找回密码邮件"), Active("活动/推广邮件");

	private EMailType(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

}
