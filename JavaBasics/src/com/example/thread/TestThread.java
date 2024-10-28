package com.example.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread {
	
	public static void main(String[] args) {
	/*	
		System.out.println("current thread name " + Thread.currentThread().getName());
		UserRunnable hwr = new UserRunnable("Hello World - runnable");
		UserRunnable her = new UserRunnable("Hello Earth - runnable");
		Thread t1 = new Thread(hwr);
		Thread t2 = new Thread(her);
				
		UserThread hwt = new UserThread("Hello World - thread");
		UserThread het = new UserThread("Hello Earth - thread");
		
		t1.setName("T1");
		t2.setName("T2");
		hwt.setName("UT1");
		het.setName("UT2");
		hwt.start();
		het.start();
		t1.start();
		t2.start();
		
		*/
		
		//callable
		BlockingQueue bq = new ArrayBlockingQueue(1); 
		ExecutorService executorService = new ThreadPoolExecutor(10, 10, 10, TimeUnit.MICROSECONDS, bq);
		System.out.println("Before execute");
		Future future = null;
		ArrayList<Future> futureList = new ArrayList<Future>();
		for(int i=0; i<10; i++) {
			future = executorService.submit(new UserCallable("Thread-"+(i+1)));
			futureList.add(future);
		}
		System.out.println("after execute");
		for (Iterator iterator = futureList.iterator(); iterator.hasNext();) {
			future = (Future) iterator.next();
			try {
				if ( future != null && future.get() != null )
					System.out.println(future.get());
				//Thread.sleep(40000);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (!executorService.isShutdown())
			executorService.shutdown();
	}
}
