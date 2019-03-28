package com.pandora.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public final class ISO8601Times {
	private ISO8601Times() {
	}

	public static String iso8601time(Date date) {
		final Date nowDate = date;
		final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		df.setTimeZone(new SimpleTimeZone(0, "GMT"));
		return df.format(nowDate);
	}
}
