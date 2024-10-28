package com.example.lambda;

public class Word {
	
	public static String match(WordCheck word, String value) {
		if (word.checkWord(value))
			System.out.println("match");
		
		return value;
	}

	
	public static void main(String[] args) {
		match(w -> w == w.toUpperCase(), "GRADUAND");
	}
}
