package com.pandora.portal.provider.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.pandora.common.base.Log;
import com.pandora.common.event.support.LogEvent;

/**
 * Generic logging service
 * 
 * @author shaobo shih
 * @version 1.0
 */
@Component
public class LogListener<E extends Log, T extends LogEvent<E>> implements ApplicationListener<T> {

	@SuppressWarnings({ "unchecked", "unused" })
	@Async
	@Override
	public void onApplicationEvent(T event) {
		E e = (E) event.getSource();
	}
}
