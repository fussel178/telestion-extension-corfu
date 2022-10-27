package org.github.fussel178.telestion.extension.corfu.corfu.mapper.exception;

public class PayloadMissingException extends CorfuDeserializationException {
	public PayloadMissingException() {
	}

	public PayloadMissingException(String message) {
		super(message);
	}

	public PayloadMissingException(String message, Throwable cause) {
		super(message, cause);
	}

	public PayloadMissingException(Throwable cause) {
		super(cause);
	}
}
