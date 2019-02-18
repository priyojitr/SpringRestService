package com.demo.exceptions;

public class CustomException extends RuntimeException {

	/**
	 * default serial
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String msg) {
		super(msg);
	}
}
