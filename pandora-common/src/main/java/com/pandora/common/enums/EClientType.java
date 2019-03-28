package com.pandora.common.enums;

/**
 * {@code Client} type enumeration
 * 
 * @author shaobo shih
 * @version 1.0
 */
public enum EClientType {
	PC("PC"), IOS("IOS"), Android("Android"), Wechat("Wechat"), Other("Other");

	private EClientType(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}
}
