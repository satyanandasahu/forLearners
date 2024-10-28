package com.example.thread;

public class Queue implements Q {

	int n;
	boolean valueSet = false;
	
	synchronized public int get() {
		while(!this.valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Interrupted");
			}
		System.out.println("Got: "+this.n);
		valueSet = false;
		notify();
		return n;
	}
	
	synchronized public void put(int n) {
		while(valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Interrupted");
			}
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}

	
}
