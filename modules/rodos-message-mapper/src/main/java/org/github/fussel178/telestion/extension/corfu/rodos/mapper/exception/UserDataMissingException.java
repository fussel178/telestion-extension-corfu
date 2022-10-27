package org.github.fussel178.telestion.extension.corfu.rodos.mapper.exception;

public class UserDataMissingException extends RodosDeserializationException {
	public UserDataMissingException() {
		super();
	}

	public UserDataMissingException(String message) {
		super(message);
	}

	public UserDataMissingException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserDataMissingException(Throwable cause) {
		super(cause);
	}
}
