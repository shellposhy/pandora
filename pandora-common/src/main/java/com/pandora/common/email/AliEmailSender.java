package com.pandora.common.email;

import com.pandora.common.email.model.AliEmail;

public interface AliEmailSender {

	public void send(final AliEmail email, final String accessKey, final String accessSecret);
}
