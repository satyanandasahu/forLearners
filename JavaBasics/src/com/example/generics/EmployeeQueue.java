package com.example.generics;

import com.example.collection.Employee;

public class EmployeeQueue {
	
	
	
	int startIndex = 0;
	int maxSize = 20;
	int count = 0;
//	int dequeuCount
	Employee array [] = new Employee[this.maxSize];
	
	/**
	 * This method used to insert values into queue
	 * @param t input parameter of type T, where T need to be passed during initialization of the object
	 * @return int 0:insertion failed, 1:insertion success
	 */
 	public int queue(Employee t) {
	
		if ( this.count != this.maxSize ) {
			this.array[count] = t;
			this.count++;
			System.out.println("Added " + t);
		} else {
			System.out.println("Queue is full");
			return 0;
		}
		return 1;
	}
	
 	
 	/**
 	 * 
 	 * @return the element based on FIFO rule, if no element returns null
 	 */
	public Employee dequeue() {
		
		Employee t = null;
		if ( this.array.length != 0 ) {
			t = this.array[0];
			for (int i = 0; i < array.length-1; i++) {
				this.array[i] = this.array[i+1];
			}
			this.count--;
			System.out.println("Removed " + t);
		} else {
			System.out.println("Queue is empty");
		}
		
		return t;
	}
	
	
	

}
