package com.example.thread;

public class ThreadSleep implements Sleep {
	
	public void sleep(String message) {
		System.out.print("[" + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Interrupted");
			e.printStackTrace();
		}
		System.out.println("]");
		
	}

}
