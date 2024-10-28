package com.example.datatype;


public class ArrayExample {
	
	public static void main(String[] args) {
		
		//single dimensional
		int  a [] = new int[10];
				
		for (int z = 0; z < a.length; z++) {
			a[z]=z;
		}
		
		System.out.print("Printing Array a: ");
		int a1 = 0;
		while(a1 < a.length ) {
			System.out.print(a[a1] + " ");
			a1++;
		}
		
		int [] b = {0,1,2,3,4,5,6,7,8,9};
		a1=0;
		System.out.print("\nPrinting Array b: ");
		do {
			System.out.print(b[a1] + " ");
			a1++;
		} while(a1 < a.length );
		
		
		
		char [] c = new char[26];
		char [] d = {'a','e','i','o','u'};
				
		for (int z = 0; z < c.length; z++) {
			c[z] = (char) (65+z);	
		}
					
		System.out.print("\nPrinting Array c: ");
		for (int z = 0; z < c.length; z++) {
			System.out.print(c[z] + " ");
		}
		
		System.out.print("\nPrinting Array d: ");
		for (int z = 0; z < d.length; z++) {
			System.out.print(d[z] + " ");
		}
		
	

		for (int z = 0; z < d.length; z++) {
			System.out.print(d[z] + " ");
		}
		 
		String [] e = new String [10];
		String [] f = {"ABCD","EFGH","IJKL","MNOP","QRST"};
		
		
		
		//double dimensional
		double [][] g = new double[11][];
		
		
		double [][] h = new double[10][];
		
		double [][] i = new double[][] {{1.0,1.0},
										{1.0,1.0},
										{1.0,1.0},
										{1.0,1.0}};
							
		
		for (int z = 0; z < g.length; z++) {
			g[z] = new double[21]; 
			for (int y = 0;  y < 20; y++)
					g[z][y]=z*y;
		}

		System.out.println("\nPrinting Array d: ");
		for (int z = 0; z < g.length; z++) {
			System.out.print("Printing multiplication of " + z + ":");
			for (int y = 0; y < g[z].length; y++)
				System.out.print(" " + g[z][y]);
			System.out.println();
		}
	}

}
