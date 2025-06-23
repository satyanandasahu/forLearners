package com.example.thread;

public class UserRunnable implements Runnable {
	
	private String message =null;
	private int sleepTime = 0;
	public UserRunnable(String msg, int sleep){
		this.message = msg;
		this.sleepTime = sleep;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(this.sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +" "+ this.message);
			System.out.println("Priority " + Thread.currentThread().getPriority() );
		//}
		
	}

}
