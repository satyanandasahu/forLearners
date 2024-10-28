package com.example.string;

public class StringExample {
	
	public static void main(String[] args) {
		
		int arrayNumber [] = {83,81,0,23,21,19,5,2,89,92,93,96,67,73,79,82};
		
		byte b = 43;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		var num = 43.37;
		double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + "+" + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
		System.out.println(num); 
		System.out.println(5 + " " + 5);
		
		String x = "He" + "ma";
		String y = "Gyana" + "ranjan";
		
		String z = y.concat(" Mohanta");
		
		String p = x.concat(" Priya");
		System.out.println(z);
		System.out.println(p);
		
		
		
/*
		//String literals
		String s1 = "Satya"; 
		String a ="abc";
		String s2 = "Satya";
		System.out.println(s1 == s2);
		if (s1==s2)
			System.out.println("s1==s2 : true");
		System.out.println(System.identityHashCode(s1) + " = " + System.identityHashCode(s2));
		System.out.println(System.identityHashCode(a));
		if (s1.equals(s2))
			System.out.println("s1.equals(s2) : true");
		
		//String new Object & String literals
		String s3 = "Satya";
		String s4 = new String("Satya");	
		if (s3==s4) System.out.println("s3==s4 : true");
		else
			System.out.println("s3==s4 : false");
			
		System.out.println(System.identityHashCode(s3) + " = " + System.identityHashCode(s4));
		if (s3.equals(s4))
			System.out.println("s3.equals(s4) : true");
		
		//String new objects
		String s5 = new String("Java");
		String s6 = new String("Java");
		
		if (s5==s6) System.out.println("s5==s6 : true");
		else
			System.out.println("s5==s6 : false");
		if (s5.equals(s6))
			System.out.println("s5.equals(s6) : true");
		
		System.out.println(System.identityHashCode(s5) + " = " + System.identityHashCode(s6));
		
		
		
		//String Intern
		String s7 = "Interned String";
		String s8 = new String("Interned String");
		if ( s7 == s8)
			System.out.println("s7 == s8 : true");
		else
			System.out.println("s7 == s8 : false");
		
		String s9 = s8.intern();
		if ( s7 == s9 )
			System.out.println("s7 == s9 : true");
		else
			System.out.println("s7 == s9 : false");
			
		System.out.println();

		*/
		}

}
