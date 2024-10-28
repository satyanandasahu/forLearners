package com.example.thread;

public class ProducerConsumerTest {
	
	public static void main(String[] args) {
		Que queue = new Que();
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		producer.thread.start();
		consumer.thread.start();
		
		System.out.println("Press Control-C to stop");
		
	}

}
