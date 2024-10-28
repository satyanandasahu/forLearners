package com.example.collection;


public class Example {
	
	//toString //hashcode //equals //Object
	public static void main(String[] args) {
		
		Example example = new Example();
		System.out.println(example);
		TestClass testClass = new TestClass();
		System.out.println(testClass);
		
		Delegate delegate = new Delegate("  ", "Satya", 
				"43", "", "Emerging Technology","24 April 1983");
		
		System.out.println(delegate);
 
	}
}

class TestClass {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	//	return "Satya";
	}
	
}