package com.pandora.common.event.support;

import org.slf4j.Logger;
import org.springframework.context.ApplicationEvent;

import com.pandora.common.base.Email;
import com.pandora.common.event.PandoraEvent;

/**
 * The base class for Email event handling
 * 
 * @see Logger
 * @see ApplicationEvent
 * @author shaobo shih
 * @version 1.0
 */
public class EmailEvent<T extends Email> extends PandoraEvent<T> {
	private static final long serialVersionUID = 1L;

	public EmailEvent(T object) {
		super(object);
	}

}
