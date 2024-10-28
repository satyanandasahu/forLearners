package com.geometry.quad;

import com.geometry.Solid;

public class Cuboid implements Solid {

	public double area(double length, double breadth, double height) {
		return 2 * (length * breadth + breadth * height + length * height);
	}

	public double volume(double length, double breadth, double height) {
		return length * breadth * height;
	}

	public double perimeter(double length, double breadth, double height) {
		return 4 * (length + breadth + height);
	}

	
}
