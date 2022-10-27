package org.github.fussel178.telestion.extension.corfu.util.stream;

import org.github.fussel178.telestion.extension.corfu.util.stream.exception.OutputStreamFullException;

public interface OutputStreamFunction<T> {
	void invoke(T t) throws OutputStreamFullException;
}
