package com.example.mypackage;
import com.example.mypackage.inheritance.A;
import com.example.mypackage.inheritance.B;
import com.example.packages.Substraction;

public class MyFirstClass implements A, B{
	
	public static void main(String[] args) {
	/*	System.out.println("Hello Everyone this is my first program");
		//com.example.mypackage.Addition addition = new Addition();
		System.out.println("1 + 2 = " + Addition.add(1,2));
		Substraction substraction = new Substraction();
		//MyFirstClass myFirstClass = new MyFirstClass();
		//System.out.println("2 - 2 = " + myFirstClass.substraction(2,2));
		System.out.println("2 - 2 = " + substraction.substraction(2,2)); */
		
		System.out.println("1 + 2 = " + Addition.add(1,2));
		System.out.println("Satya + Madhu = " + Addition.add("Satya" , "Madhu"));
		System.out.println("1.5 + 2.5 = " + Addition.add(1.5f,2.5f));
		System.out.println("1 + 2 = " + Addition.add(1l,2l));
		System.out.println("1.5 + 2.5 = " + Addition.add(1.5,2.5));
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calculateROIRD(double percentage, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	/*
	 * Access specifier 
	 * Public, Protected, Private, Default 
	 * 
	 * 
	 */
	

}
