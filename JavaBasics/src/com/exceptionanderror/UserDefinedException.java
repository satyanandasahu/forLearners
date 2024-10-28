package com.exceptionanderror;

public class UserDefinedException extends RuntimeException {
	
	public UserDefinedException() {
		
	}

	public UserDefinedException(String message) {
		
		
		
	}
	
	public UserDefinedException(String message, Exception e) {
		System.out.println("hello world");
	}
}
