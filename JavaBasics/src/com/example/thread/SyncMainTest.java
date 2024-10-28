package com.example.thread;

public class SyncMainTest {

	public static void main(String[] args) {

		System.out.println("Non Sychronised Examlpe");
		// Non Synchronized example
		ThreadSleep threadSleep = new ThreadSleep();
		CallerThread a = new CallerThread(threadSleep, "Hello");
		CallerThread b = new CallerThread(threadSleep, "Synchronised");
		CallerThread c = new CallerThread(threadSleep, "world");

		// start the thread
		a.thread.start();
		b.thread.start();
		c.thread.start();

		// wait for threads to end
		try {
			a.thread.join();
			b.thread.join();
			c.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Interrupted");
		}

		System.out.println("Sychronised Examlpe with synchronised key words");
		//Synchronized example
		ThreadSleepSynchronized threadSleepSynchronized = new ThreadSleepSynchronized();
		CallerThread x = new CallerThread(threadSleepSynchronized, "Hello");
		CallerThread y = new CallerThread(threadSleepSynchronized, "Synchronised");
		CallerThread z = new CallerThread(threadSleepSynchronized, "world");

		// start the thread
		x.thread.start();
		y.thread.start();
		z.thread.start();

		// wait for threads to end
		try {
			x.thread.join();
			y.thread.join();
			z.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Interrupted");
		}

		System.out.println("Sychronised Examlpe with synchronized block");
		// Non Synchronized example
		threadSleep = new ThreadSleep();
		CallerThreadSynchronised p = new CallerThreadSynchronised(threadSleep, "Hello");
		CallerThreadSynchronised q = new CallerThreadSynchronised(threadSleep, "Synchronised");
		CallerThreadSynchronised r = new CallerThreadSynchronised(threadSleep, "world");

		// start the thread
		p.thread.start();
		q.thread.start();
		r.thread.start();

		// wait for threads to end
		try {
			a.thread.join();
			b.thread.join();
			c.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Interrupted");
		}

	}

}
