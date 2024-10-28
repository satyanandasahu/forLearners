package com.example.thread;

public class ProdConsTest {

	public static void main(String[] args) {
		Queue queue = new Queue();
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		producer.thread.start();
		consumer.thread.start();

		System.out.println("Press Control-C to stop");
	}
}
