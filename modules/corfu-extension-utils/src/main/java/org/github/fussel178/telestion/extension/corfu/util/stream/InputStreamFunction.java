package org.github.fussel178.telestion.extension.corfu.util.stream;

import org.github.fussel178.telestion.extension.corfu.util.stream.exception.InputStreamEmptyException;

public interface InputStreamFunction {
	Object invoke() throws InputStreamEmptyException;
}
