package com.example.thread;

public class CallerThread implements Runnable {
	
	String message;
	Sleep threadSleep;
	Thread thread;

	public CallerThread(Sleep threadSleep, String message) {
		this.threadSleep = threadSleep;
		this.message = message;
		this.thread = new Thread(this);
				
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.threadSleep.sleep(message);
	}

}
