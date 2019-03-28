package com.pandora.common.event;

import org.springframework.context.ApplicationEvent;

/**
 * The base class for event handling
 * 
 * 
 * @see ApplicationEvent
 * @author shaobo shih
 * @version 1.0
 */
public class PandoraEvent<T> extends ApplicationEvent {
	private static final long serialVersionUID = 1L;

	public PandoraEvent(T object) {
		super(object);
	}
}
