package org.github.fussel178.telestion.extension.corfu.corfu.mapper.exception;

public class PacketTooSmallException extends CorfuDeserializationException {
	public PacketTooSmallException() {
		super();
	}

	public PacketTooSmallException(String message) {
		super(message);
	}

	public PacketTooSmallException(String message, Throwable cause) {
		super(message, cause);
	}

	public PacketTooSmallException(Throwable cause) {
		super(cause);
	}
}
