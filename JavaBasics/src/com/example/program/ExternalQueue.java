package com.example.program;

import java.lang.reflect.Array;

public class ExternalQueue<T> {

	T array[];
	int c = 0;
	int size = 0;
	int de = 0;

	@SuppressWarnings("unchecked")
	public ExternalQueue(Class<T> clazz, int size) {
		this.array = (T[]) Array.newInstance(clazz, size);
		this.size = size;
		// this.array = array;
	}

	public void expandQueue(Class<T> clazz, int size) {
		T[] tempArray = this.array;
		this.array = (T[]) Array.newInstance(clazz, size);
		for (int i = 0; i < tempArray.length; i++) {
			this.array[i] = tempArray[i];
		}
		this.size = size;
	}

	public void queue(T t) {
		if (this.c == this.size) {
			System.out.println("Queue is full");
		} else {
			if (t != null)
				this.array[this.c] = t;
			this.c = this.c + 1;
		}
	}

	public T dequeue() {
		if (this.c == 0) {
			System.out.println("Queue is empty");
			return null;
		} else {
			// System.out.println("Value c in pop "+ this.c);
			T value = this.array[this.de];
			for (int i = 0; i < this.c - 1; i++) {
				this.array[i] = this.array[i + 1];
			}
			this.c = this.c - 1;
			return value;
		}
	}

	public static void main(String[] args) {
		ExternalQueue<String> queue = new ExternalQueue<String>(String.class, 10);
		// Queuing operation
		System.out.println("Queuing started");
		for (int i = 0; i < 10; i++) {
			queue.queue("Value " + i);
			System.out.println("Value " + i);
		}
	//	queue.expandQueue(String.class, 20);
		for (int i = 0; i < 10; i++) {
			queue.queue("value" + (i + 10));
			System.out.println("Value " + (i + 10));
		}

		System.out.println("dequeuing started");
		for (int i = 0; i < 21; i++) {
			String deQueueValue = queue.dequeue();
			if (deQueueValue != null && !deQueueValue.isEmpty())
				System.out.println(deQueueValue);
		}
		
		System.out.println("----------------------");
		queue.queue("q");
		queue.queue("w");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
	}

}
