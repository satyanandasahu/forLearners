package com.example.thread;

public class Producer implements Runnable {

	Q queue;
	Thread thread;
	
	Producer(Q queue){
		this.queue = queue;
		this.thread = new Thread(this,"Producer");
	}
	
	public void run() {
		int i = 0;
		while (true) {
			queue.put(i++);
			/*
			 * try { this.thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
	}
}
