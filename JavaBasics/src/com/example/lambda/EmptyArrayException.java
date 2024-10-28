package com.example.lambda;

public class EmptyArrayException extends RuntimeException {

	EmptyArrayException(){
		super("Array Empty");
	}
}
