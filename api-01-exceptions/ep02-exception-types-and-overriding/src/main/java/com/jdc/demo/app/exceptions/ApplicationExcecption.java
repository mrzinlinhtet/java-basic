package com.jdc.demo.app.exceptions;

public class ApplicationExcecption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Type {
		Info, Warning, Error
	}

	private Type type;

	public ApplicationExcecption(Type type) {
		super();
		this.type = type;
	}

	public ApplicationExcecption(Type type, String message, Throwable cause) {
		super(message, cause);
		this.type = type;
	}

	public ApplicationExcecption(Type type, String message) {
		super(message);
		this.type = type;
	}

	public Type getType() {
		return type;
	}

}
