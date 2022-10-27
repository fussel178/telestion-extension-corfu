package org.github.fussel178.telestion.extension.corfu.corfu.mapper.exception;

public class CorfuDeserializationException extends CorfuException {
	public CorfuDeserializationException() {
	}

	public CorfuDeserializationException(String message) {
		super(message);
	}

	public CorfuDeserializationException(String message, Throwable cause) {
		super(message, cause);
	}

	public CorfuDeserializationException(Throwable cause) {
		super(cause);
	}
}
