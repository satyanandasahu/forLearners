package com.example.thread;

public class ThreadJoinExample implements Runnable {

	String threadName;
	Thread t;

	public ThreadJoinExample(String threadName) {
		this.threadName = threadName;
		t = new Thread(this, this.threadName);
		System.out.println("New thread: " + t);
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(this.threadName + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(this.threadName + " interrupted.");
			e.printStackTrace();
		}
		System.out.println(this.threadName + " exiting");
	}
}
