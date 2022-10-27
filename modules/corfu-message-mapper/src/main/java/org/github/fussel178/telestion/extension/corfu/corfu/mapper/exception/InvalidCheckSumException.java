package org.github.fussel178.telestion.extension.corfu.corfu.mapper.exception;

public class InvalidCheckSumException extends CorfuDeserializationException {
	public InvalidCheckSumException() {
		super();
	}

	public InvalidCheckSumException(String message) {
		super(message);
	}

	public InvalidCheckSumException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidCheckSumException(Throwable cause) {
		super(cause);
	}
}
