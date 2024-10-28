package com.example.operator;

public class SwitchExample {

	public static void main(String[] args) {

		Integer value = Integer.valueOf(args[0]);

		switch (value) {
		case 0:
			System.out.println("Java");
			break;
		case 1:
			System.out.println("Java World");
			break;
		default:
			System.out.println("Java World");

		}

		switch (args[1].toUpperCase()) {
		case "JAVA":
			System.out.println("Java is Everywhere");
			break;
		case "Cloud":
			System.out.println("Cloud growing slowly");
			break;
		case "AWS":
			System.out.println("AWS rocking on cloud platform");
			break;
		default:
			System.out.println("Java World");

		}
		Choice choice = Choice.valueOf(args[2]);
		switch (choice) {
		case Yes:
			System.out.println("Choice: Yes");
			break;
		case No:
			System.out.println("Choice: No");
			break;
		}
	}

}

enum Choice {
	Yes, No
};
