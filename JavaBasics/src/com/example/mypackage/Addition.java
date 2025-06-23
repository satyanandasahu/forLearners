package com.example.mypackage;

public class Addition {

	public static int add(int num1, int num2) {
		System.out.print("inside int method");
		return num1+num2;
	}
	
	public static String add(String num1, String num2) {
		System.out.print("inside string method");
		return num1+num2;
	}
	
	public static float add(float num1, float num2) {
		System.out.print("inside float method");
		return num1 + num2;
	}
	public static double add(double num1, double num2) {
		System.out.print("inside double method");
		return num1 + num2;
	}
	
	public static long add(long num1, long num2) {
		System.out.print("inside long method");
		return num1 + num2;
	}
}
