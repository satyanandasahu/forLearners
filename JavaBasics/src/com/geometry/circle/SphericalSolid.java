package com.geometry.circle;

import com.geometry.Solid;

public abstract class SphericalSolid implements Solid {

		
	
	public abstract double area(double radius, double height);

	
	public abstract double volume(double radius, double height);

	
	public abstract double perimeter(double radius, double height);


	@Override
	public double area(double length, double breadth, double height) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double volume(double length, double breadth, double height) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double perimeter(double length, double breadth, double height) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
