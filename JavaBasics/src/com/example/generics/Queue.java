package com.example.generics;

import java.lang.reflect.Array;

import com.example.mypackage.inheritance.Employee;

public class Queue<T> {
	
	
	T array [];
	private final static int maxSize = 20;
	int startIndex = 0;
	int count = -1;
	
	public Queue(Class<T> clazz) {
		this.array = (T[]) Array.newInstance(clazz, this.maxSize);
	}

	/**
	 * This method used to insert values into queue
	 * @param t input parameter of type T, where T need to be passed during initialization of the object
	 * @return int 0:insertion failed, 1:insertion success
	 */
 	public int queue(T t) {
 		if (this.count == -1)
			this.count = 0;
		if ( this.count != this.maxSize ) {
			this.array[count] = t;
			System.out.println("Added to queue: " + t);
			this.count++;
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
	public T dequeue() {
		
		T t = null;
		if ( this.count > -1 ) {
			t = this.array[0];
			for (int i = 0; i < array.length-1; i++) {
				this.array[i] = this.array[i+1];
			}
			this.count--;
			System.out.println("removed from queue: " + t);
		} else {
			System.out.println("Queue is empty");
		}
		
		return t;
	}
	
	
	

}
