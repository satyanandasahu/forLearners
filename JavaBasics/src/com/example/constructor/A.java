package com.example.constructor;

public class A {

	
	/*
	 * static { System.out.println("Inside Static block"); }
	 */
	public A() {
		System.out.println("A");
	}
	
	public static void method() {
		System.out.println("inside static method");
	}
	
	
	public static void main(String[] args) {
		
		try { 
			int a = 0;
			int b= 100;
			int c = b/a;
		} finally {
			System.out.println("inside finally block");
		}
		
		
	}
}
