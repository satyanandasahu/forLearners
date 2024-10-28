package com.example.datatype;

import java.util.ArrayList;

public class Wrapper {
	
	Number number;
	
	/*
	 * Byte
	 * Boolean
	 * Character
	 * Short
	 * Integer
	 * Long
	 * Float
	 * Double
	 */
	
	public static void main(String[] args) {
		Number intValue = 10;
		Integer i1 = 10;
		Integer i2  = 10;
		Integer i3;
		int x = 10;
		//	testNull(i3);
		
		if (intValue.equals(x))
			System.out.println("match");
		if (i1 != i2 )
			System.out.println("match");
		else 
			System.out.println("no match");
		
		if ( i1.equals(i2))
			System.out.println("match");
		else 
			System.out.println("no match");
		
		
		
			
			ArrayList list = new ArrayList();
		list.add(10);
		
	}
	
	public static void testNull(Integer y) {
		int x = 5;
		System.out.println("print " + (x + y));
	}

}
