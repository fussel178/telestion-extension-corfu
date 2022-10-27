package org.github.fussel178.telestion.extension.corfu.corfu.mapper.exception;

public class PayloadTooSmallException extends CorfuDeserializationException {
	public PayloadTooSmallException() {
	}

	public PayloadTooSmallException(String message) {
		super(message);
	}

	public PayloadTooSmallException(String message, Throwable cause) {
		super(message, cause);
	}

	public PayloadTooSmallException(Throwable cause) {
		super(cause);
	}
}
