package org.github.fussel178.telestion.extension.corfu.util;

import java.time.Instant;

public class TimeUtils {
	public static long toNanoSeconds(Instant timestamp) {
		return timestamp.getEpochSecond() * 1000000000L + timestamp.getNano();
	}
}
