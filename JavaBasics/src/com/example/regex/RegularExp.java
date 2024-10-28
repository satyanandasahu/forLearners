package com.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		Pattern pattern;
		Matcher matcher;
		Boolean found;

		pattern = Pattern.compile("Java");
		matcher = pattern.matcher("Java World");
		found = matcher.matches();
		if (found)
			System.out.println("Matches");
		else
			System.out.println("No Match");

		if (matcher.find()) {
			System.out.println("found the word");
			System.out.println("found at index " + matcher.start() + " end at index " + matcher.end());
		}
		
		pattern = Pattern.compile("Java");
		matcher = pattern.matcher("Java World is bigger than you think, Java");
		found = matcher.matches();
		if (found)
			System.out.println("Matches");
		else
			System.out.println("No Match");

		System.out.println("\n Wildcard Use ");
		while (matcher.find()) {
			System.out.println("found the word");
			System.out.println("Print the group " + matcher.group());
			//System.out.println("print the word ");
			System.out.println("found at index " + matcher.start() + " end at index " + matcher.end());
		}

	}
}
