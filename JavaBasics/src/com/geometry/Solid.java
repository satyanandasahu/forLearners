package com.geometry;

public interface Solid {
	
	/*
	 * public double area(int side); public double volume(int side); public double
	 * perimeter(int side);
	 */
	public double area(double length, double breadth, double height);
	public double volume(double length, double breadth, double height);
	public double perimeter(double length, double breadth, double height);


}
