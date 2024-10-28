package com.example.program;

import java.lang.reflect.Array;

public class ExternalStack<T> {

	T array[];
	int c = 0;
	int size = 0;

	@SuppressWarnings("unchecked")
	public ExternalStack(Class<T> clazz, int size) {
		this.array = (T[]) Array.newInstance(clazz, size);
		this.size = size;
	}

	public void expandStack(Class<T> clazz, int size) {
		T[] tempArray = this.array;
		this.array = (T[]) Array.newInstance(clazz, size);
		for (int i = 0; i < tempArray.length; i++) {
			this.array[i] = tempArray[i];
		}
		this.size = size;
	}

	public void push(T t) {
		if (this.c == this.size) {
			System.out.println("Stack is full");
		} else {
			if (t != null)
				this.array[this.c] = t;
			this.c = this.c + 1;
		}
	}

	public T pop() {
		if (this.c == 0) {
			System.out.println("stack is empty");
			return null;
		} else {
			// System.out.println("Value c in pop "+ this.c);
			T value = this.array[this.c - 1];
			this.c = this.c - 1;
			return value;
		}
	}

	public static void main(String[] args) {
		ExternalStack<String> stack = new ExternalStack<String>(String.class, 10);
		// push operation
		System.out.println("Push operation started");
		for (int i = 0; i < 10; i++) {
			stack.push("value " + i);
			System.out.println("value " + i);
		}
		stack.expandStack(String.class, 20);
		for (int i = 0; i < 10; i++) {
			stack.push("value " + (i + 10));
			System.out.println("value " + (i + 10));
		}

		//pop operation started
		System.out.println("Pop operation started");
		for (int i = 0; i < 20; i++) {
			String popValue = stack.pop();
			if (popValue != null && !popValue.isBlank())
				System.out.println(popValue);
		}
		
		
		 ExternalStack<Integer> stac = new ExternalStack<Integer>(Integer.class, 10);
		 System.out.println("Push of integer number started");
		 for (int i=0; i<10; i++) { 
			 stac.push(i); 
			 System.out.println(i); 
		 } 
		 System.out.println("Pop of integer number started");
		 for (int i=0; i<10; i++) {
		  System.out.println(stac.pop()); 
		 }
		 
		 System.out.println("-----------------------");
		 stack.push("q");
		 stack.push("w");
		 System.out.println(stack.pop());
		 System.out.println(stack.pop());
	}

}
