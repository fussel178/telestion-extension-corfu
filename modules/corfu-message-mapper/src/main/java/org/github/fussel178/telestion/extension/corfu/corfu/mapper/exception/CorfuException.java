package org.github.fussel178.telestion.extension.corfu.corfu.mapper.exception;

public abstract class CorfuException extends Exception {
	protected CorfuException() {
	}

	protected CorfuException(String message) {
		super(message);
	}

	protected CorfuException(String message, Throwable cause) {
		super(message, cause);
	}

	protected CorfuException(Throwable cause) {
		super(cause);
	}
}
