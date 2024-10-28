package com.geometry.quad;

import com.geometry.Solid;

public class Cube { //implements Solid {

	
	private double side;
	
	public Cube(double side){
		this.side = side;
	}

	public Cube() {
		
	}

	
	public double area(double side, double breadthNotRequired, double hieghtNotRequired) {
		return 6 * (Math.pow(side, 2));
	}

	public double area() {
		return 6 * (Math.pow(this.side, 2));
	}
	
	public double volume(double side, double breadthNotRequired, double hieghtNotRequired) {
		return Math.pow(side, 3);
	}
	
	public double volume() {
		return Math.pow(this.side, 3);
	}

	public double perimeter(double side, double breadthNotRequired, double hieghtNotRequired) {
		return 12 * side;
	} 
	
	public double perimeter() {
		return 12 * this.side;
	}

	

	

	 

	
}
