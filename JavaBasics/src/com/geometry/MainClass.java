package com.geometry;

import java.util.Scanner;

import com.geometry.circle.Sphere;
import com.geometry.circle.SphericalSolid;
import com.geometry.quad.Cube;
import com.geometry.quad.Cuboid;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("Enter the side of Cube ");
		//int side = scanner.nextInt();
		/*
		 * for (int i=0; i < args.length; i++) {
		 * 
		 * System.out.print( args[i] + " ");
		 * 
		 * }
		 */
		Cube hema = new Cube();
		System.out.println("The area of cube " + hema.area(10,0,0));
		System.out.println("The volume of cube " + hema.volume(10,0,0));
		System.out.println("The perimeter of cube " + hema.perimeter(10,0,0));
		
		Cube kirthi = new Cube(20);
		System.out.println("The area of cube " + kirthi.area());
		System.out.println("The volume of cube " + kirthi.volume());
		System.out.println("The perimeter of cube " + kirthi.perimeter());
		
		//Integer.parseInt(args[0]))
	
		/*
		 * System.out.println(""); Solid cuboid = new Cuboid();
		 * System.out.println("The area of cuboid " + cuboid.area(43,43,43));
		 * System.out.println("The volume of cuboid " + cuboid.volume(43,43,43));
		 * System.out.println("The perimeter of cuboid " + cuboid.perimeter(43,43,43));
		 * 
		 * System.out.println(""); SphericalSolid sphere = new Sphere();
		 * System.out.println("The area of sphere " + sphere.area(43,43));
		 * System.out.println("The volume of sphere " + sphere.volume(43,43));
		 * System.out.println("The perimeter of sphere " + sphere.perimeter(43,43));
		 */
	}
	
	
	

}
