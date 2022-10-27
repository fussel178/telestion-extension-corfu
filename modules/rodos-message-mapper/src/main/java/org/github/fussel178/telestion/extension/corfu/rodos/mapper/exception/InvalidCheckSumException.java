package org.github.fussel178.telestion.extension.corfu.rodos.mapper.exception;

public class InvalidCheckSumException extends RodosDeserializationException {
	public InvalidCheckSumException() {
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
