package com.demo.exceptions;

public class AnotherCustomException extends RuntimeException {

	/**
	 * default serial
	 */
	private static final long serialVersionUID = 1L;
	
	public AnotherCustomException(String msg) {
		super(msg);
	}

}
