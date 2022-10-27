package org.github.fussel178.telestion.extension.corfu.util;

import java.nio.file.Path;

public class PathUtils {

	public static String getFileName(Path path) {
		return getFileName(path, false);
	}

	public static String getFileName(Path path, boolean withoutEnding) {
		var filename = path.getFileName().toString();
		return withoutEnding ? filename.replaceAll("(?<!^)[.].*", "") : filename;
	}

	// prevent instantiation
	private PathUtils() {
	}
}
