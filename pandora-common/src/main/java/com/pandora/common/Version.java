package com.pandora.common;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Version
 * 
 * @author shellpo shih
 * @version 1.0
 */
public final class Version {
	private static final Logger LOGGER = LoggerFactory.getLogger(Version.class);
	// RPC protocol version, for compatibility, it must not be between
	public static final String DEFAULT_RPC_PROTOCOL_VERSION = "1.0";
	// Indexing service version
	public static final String DEFAULT_LUCENE_SERVICE_VERSION = "1.0";
	private static final Map<String, Integer> VERSION2INT = new HashMap<String, Integer>();

	static {
		LOGGER.info("Version");
		VERSION2INT.put("RPC", parseInt(DEFAULT_RPC_PROTOCOL_VERSION));
		VERSION2INT.put("INDEX", parseInt(DEFAULT_LUCENE_SERVICE_VERSION));
	}

	/* ========private utilities======== */
	private static int parseInt(String version) {
		int v = 0;
		String[] vArr = version.split("\\.");
		int len = vArr.length;
		for (int i = 0; i < len; i++) {
			v += Integer.parseInt(getDigital(vArr[i])) * Math.pow(10, (len - i - 1) * 2);
		}
		return v;
	}

	private static String getDigital(String v) {
		int index = 0;
		for (int i = 0; i < v.length(); i++) {
			char c = v.charAt(i);
			if (Character.isDigit(c)) {
				if (i == v.length() - 1) {
					index = i + 1;
				} else {
					index = i;
				}
				continue;
			} else {
				index = i;
				break;
			}
		}
		return v.substring(0, index);
	}
}
