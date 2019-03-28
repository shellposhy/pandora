package com.pandora.common.enums;

/**
 * {@code Log} type enumeration
 * 
 * @author shaobo shih
 * @version 1.0
 */
public enum ELogType {
	Default("默认"), User("用户"), Access("访问");

	private ELogType(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

}
