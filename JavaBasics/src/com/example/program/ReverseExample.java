package com.example.program;

import com.example.lambda.ReverseFunction;

public class ReverseExample {

	public static void main(String[] args) {
		System.out.println("Reverse value of 123 by reverse method " + getReverseOfNumber(123));
		System.out.println("Reverse value of 123 by recursion reverse method " + reverse(123, 0));

		// Genric Lambda Function
		ReverseFunction<Integer> reverseInt = (n) -> {
			int rev = 0;
			while (n != 0) {
				rev = (rev * 10) + n % 10;
				n = n / 10;
			}
			return rev;
		};
		System.out.println("Reverse value of 123 using lambda function" + reverseInt.reverse(1981));
	}

	public static int getReverseOfNumber(int num) {
		int rev = 0;
		while (num != 0) {
			rev = (rev * 10) + num % 10;
			num = num / 10;
		}
		return rev;
	}

	public static int reverse(int num, int reverse) {
		if (num != 0) {
			reverse = reverse * 10 + ((num % 10));
			return reverse(num / 10, reverse);
		}
		return reverse;
	}

}
