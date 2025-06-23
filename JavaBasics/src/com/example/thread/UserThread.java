package com.example.thread;

public class UserThread extends Thread {

	
	private String message =null;

	public UserThread(String msg){
		this.message = msg;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		//for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + this.message);			
		//}
	}

	
}
