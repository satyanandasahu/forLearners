package com.example.thread;

public class CallerThreadSynchronised implements Runnable {
	
	String message;
	Sleep threadSleep;
	Thread thread;

	public CallerThreadSynchronised(Sleep threadSleep, String message) {
		this.threadSleep = threadSleep;
		this.message = message;
		this.thread = new Thread(this);
				
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this.threadSleep) {
			this.threadSleep.sleep(message);
		}
	}

}
