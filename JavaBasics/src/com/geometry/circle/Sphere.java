package com.geometry.circle;

public class Sphere extends SphericalSolid {

	
	
	@Override
	public double area(double radius, double height) {
		// TODO Auto-generated method stub
		return 4*Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double volume(double radius,double height) {
		// TODO Auto-generated method stub
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}

	@Override
	public double perimeter(double radius, double height) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
