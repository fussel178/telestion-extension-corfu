package org.github.fussel178.telestion.extension.corfu.corfu.mapper.exception;

public class CorfuSerializationException extends CorfuException {
	public CorfuSerializationException() {
	}

	public CorfuSerializationException(String message) {
		super(message);
	}

	public CorfuSerializationException(String message, Throwable cause) {
		super(message, cause);
	}

	public CorfuSerializationException(Throwable cause) {
		super(cause);
	}
}
