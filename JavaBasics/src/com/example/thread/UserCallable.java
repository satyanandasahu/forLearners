package com.example.thread;

import java.util.concurrent.Callable;

public class UserCallable implements Callable<Object> {
	
	String threadName;
	
	public UserCallable(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Process Initiated");
		Thread.sleep(10000);
		System.out.println("Processing.....");
		Thread.sleep(10000);
		System.out.println("Completed");
		return this.threadName + " Satya";
	}
}
