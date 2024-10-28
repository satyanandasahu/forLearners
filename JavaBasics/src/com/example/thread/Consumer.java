package com.example.thread;

public class Consumer implements Runnable {

	Q queue;
	Thread thread;
	
	Consumer(Q queue){
		this.queue = queue;
		this.thread = new Thread(this,"Consumer");
	}
	
	public void run() {
		while (true) {
			queue.get();
			/*
			 * try { this.thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
	}
}
