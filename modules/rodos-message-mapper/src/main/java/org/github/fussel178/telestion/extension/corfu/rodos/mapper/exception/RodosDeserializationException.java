package org.github.fussel178.telestion.extension.corfu.rodos.mapper.exception;

public class RodosDeserializationException extends RodosException {
	public RodosDeserializationException() {
	}

	public RodosDeserializationException(String message) {
		super(message);
	}

	public RodosDeserializationException(String message, Throwable cause) {
		super(message, cause);
	}

	public RodosDeserializationException(Throwable cause) {
		super(cause);
	}
}
