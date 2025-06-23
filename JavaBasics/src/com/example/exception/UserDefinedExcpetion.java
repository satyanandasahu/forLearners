package com.example.exception;

public class UserDefinedExcpetion extends Exception {

	public UserDefinedExcpetion() {
		super();
	}

	public UserDefinedExcpetion(String message) {
		super("UserDefinedException: " + message);
	}

	public UserDefinedExcpetion(Throwable cause) {
		super(cause);
	}

	public UserDefinedExcpetion(String message, Throwable cause) {
		super(message, cause);
	}

	public UserDefinedExcpetion(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	
	
	

}
