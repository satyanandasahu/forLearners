package com.example.thread;

public class DemoJoin {
	
	public static void main(String[] args) {
		
		ThreadJoinExample tj1 = new ThreadJoinExample("A");
		ThreadJoinExample tj2 = new ThreadJoinExample("B");
		ThreadJoinExample tj3 = new ThreadJoinExample("C");
		Thread tj4 = new Thread(new ThreadJoinExample("D"));
		tj1.t.start();
		tj2.t.start();
		tj3.t.start();
		tj4.start();
		
		System.out.println("Thread A is alive: " + tj1.t.isAlive());
		System.out.println("Thread B is alive: " + tj2.t.isAlive());
		System.out.println("Thread C is alive: " + tj3.t.isAlive());
		System.out.println("Thread D is alive: " + tj4.isAlive());
		//wait for threads to finish
		try {
			System.out.println("Waiting for threads to finish");
			tj1.t.join();
			tj2.t.join();
			tj3.t.join();
			tj4.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Main thread Interrupted");
			e.printStackTrace();
		}
		System.out.println("Thread A is alive: " + tj1.t.isAlive());
		System.out.println("Thread B is alive: " + tj2.t.isAlive());
		System.out.println("Thread C is alive: " + tj3.t.isAlive());
		System.out.println("Thread D is alive: " + tj4.isAlive());
		
		System.out.println("Main thread exiting");
	}

}
