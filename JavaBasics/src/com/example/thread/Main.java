package com.example.thread;

import java.util.Timer;

public class Main {
	
	public static void main(String[] args) {
		TimerExample te1 = new TimerExample("Task1");
		TimerExample te2 = new TimerExample("Task2");
		Timer t = new Timer();
		t.schedule(te1, 0, 100 );
		t.schedule(te2, 0, 1000 );
	}

}
