package com.example.thread;

public class Que implements Q {

	int n;
	
	synchronized public int get() {
		System.out.println("Got: "+this.n);
		return n;
	}
	
	synchronized public void put(int n) {
		this.n = n;
		System.out.println("Put: " + n);
	}
}
