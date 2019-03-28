package com.pandora.common.event.support;

import org.slf4j.Logger;
import org.springframework.context.ApplicationEvent;

import com.pandora.common.base.Log;
import com.pandora.common.event.PandoraEvent;

/**
 * The base class for log event handling
 * 
 * @see Logger
 * @see ApplicationEvent
 * @author shaobo shih
 * @version 1.0
 */
public class LogEvent<T extends Log> extends PandoraEvent<T> {
	private static final long serialVersionUID = 1L;

	public LogEvent(T object) {
		super(object);
	}

}
