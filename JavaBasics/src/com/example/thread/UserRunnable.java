package com.example.thread;

public class UserRunnable implements Runnable {
	
	private String message =null;

	public UserRunnable(String msg){
		this.message = msg;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() +" "+ this.message);			
		}
		
	}

}
