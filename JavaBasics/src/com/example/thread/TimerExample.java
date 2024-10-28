package com.example.thread;

import java.util.Date;
import java.util.TimerTask;

public class TimerExample extends TimerTask {

	private String name;
	
	public TimerExample(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " " + this.name + "the task has executed successfully " + new Date());
		if ( "Task1".equals(this.name)) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	
	
	
}
