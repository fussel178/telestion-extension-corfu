package org.github.fussel178.telestion.extension.corfu.rodos.mapper.exception;

public class UserDataTooLargeException extends RodosDeserializationException {
	public UserDataTooLargeException() {
		super();
	}

	public UserDataTooLargeException(String message) {
		super(message);
	}

	public UserDataTooLargeException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserDataTooLargeException(Throwable cause) {
		super(cause);
	}
}
