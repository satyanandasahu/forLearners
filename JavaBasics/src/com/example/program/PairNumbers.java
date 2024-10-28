package com.example.program;

import java.util.Arrays;
import java.util.Scanner;

/* 
 * program to print the output (a,b) (b,d) (d,e) where (a+b)=(b+c)=(d+e) = n 
 * from a given array of numbers and the value of n is also given 
 * for example for this given array {0,1,2,3,4,5,6} and n = 6 
 * the output should be printed as (0, 6)(1, 5)(2, 4);
 *  where n=5 output should be  (0, 5)(1, 4)(2, 3)  
 *
*/
public class PairNumbers {
	
public static void main(String[] args) {
	    
	    //String args [] = {"0","1","2","3","4","5","6"};
	    
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	    int[] intArray = Arrays.stream(args)
                               .mapToInt(Integer::parseInt)
                               .toArray();
        
	    for (int i=0; i<intArray.length; i++ ) {
	        for (int j=i; j<intArray.length; j++ ) {
	            if (intArray[i] + intArray[j] == n && intArray[i] != intArray[j] )
	             System.out.print("("+intArray[i] + ", " + intArray[j] + ")" );
	        }
	    }
        	
	}

}
