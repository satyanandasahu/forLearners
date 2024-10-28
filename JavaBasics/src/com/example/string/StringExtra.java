package com.example.string;

public class StringExtra {
	
	
	public static void main(String[] args) {
		
		String name = "Satya";
		name.concat("nanda Sahu");
		System.out.println("x = " + name);
		name = name.concat("nanda Sahu");
		System.out.println("x = " + name);
		
		
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def").reverse().replace(0, 2,"xy");
		System.out.println( sb );
		
		
		StringBuilder builder = new StringBuilder("Satya");
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Satya");
		stringBuilder.append("nanda ").append("Sahu");
		System.out.println("Name: " + builder);
		System.out.println("Full Name: " + stringBuilder);
				
		
		StringBuffer buffer = new StringBuffer("Satya");
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Satya");
		stringBuffer.append("nanda ").append("Sahu");
		System.out.println("Name: " + buffer);
		System.out.println("Full Name: " + stringBuffer);
	}

}
