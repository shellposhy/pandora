package com.pandora.common;

import com.pandora.common.email.model.AliEmail;

/**
 * AliMail test case
 */
public class AliMailTest {

	public void setUp() throws Exception {
	}

	public void test() {
		AliEmail mail = new AliEmail();
		mail.setAccountName("register@nanshanguoji.com");
		mail.setFromAlias("南山国际");
		mail.setToAddress("290206760@qq.com");
		mail.setSubject("注册验证邮件");
		mail.setHtmlBody("测试邮件");

	}

}
