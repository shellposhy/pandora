package com.pandora.common.event.support;

import org.slf4j.Logger;
import org.springframework.context.ApplicationEvent;

import com.pandora.common.event.PandoraEvent;
import com.pepper.spring.base.BaseEntity;

/**
 * The base class for Index event handling
 * 
 * @see Logger
 * @see ApplicationEvent
 * @author shaobo shih
 * @version 1.0
 */
public class IndexEvent<T extends BaseEntity> extends PandoraEvent<T> {
	private static final long serialVersionUID = 1L;

	public IndexEvent(T object) {
		super(object);
	}

}
