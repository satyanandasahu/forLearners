package com.example.lambda;

public class LambdaExample {

	public static void main(String[] args) {
		
		//getting the number lambda expression
		GetNumber number;
		
		number = () -> 144.44;
		/*
		 * getValue(){
		 *  return 144.44;
		 * } 
		 * 
		 */
		
		System.out.println("Get Value: "+ number.getValue());
		
		
		number = () -> { return Math.random() * 100; };
		
		/*
		 * getValue(){
		 *  return Math.random() * 100;
		 * } 
		 * 
		 */
		System.out.println("Random value: " + number.getValue());
		
		//odd even check
		NumericCheck isEven = (n) -> ((n%2)==0);
		/*
		 * boolean check(int n){
		 * 		return ((n%2)==0);
		 * }
		 */
		if ( isEven.check(10))
			System.out.println("Number is Even");
		if ( !isEven.check(11))
			System.out.println("Number is Odd"); 
		
		//Positive Negative check
		NumericCheck isPositiveNumber = (n) -> (n > 0);
		if ( isPositiveNumber.check(10) )
			System.out.println("Positive number");
		if ( !isPositiveNumber.check(-8) )
			System.out.println("Negative number");
		
		NumericCheck isAbsoulte = n -> { return n > 0; };
		if ( isAbsoulte.check(10) )
			System.out.println("Positive number");
		if ( !isAbsoulte.check(-8) )
			System.out.println("Negative number");
		
		//Lambda expressions with two parameters
		UtilCheck checkFactor = (a,b) -> ( (a%b) == 0 );
		int a = 2;
		int b = 2;
		if (checkFactor.check(a,b))
			System.out.println(a + " & " + b + " are factor to each other");
		else
			System.out.println(a + " & " + b + " are not factor to each other");
		
	//reverse string 
		ReverseString reverseString = (str) -> {
			String result = "";
			for(int i=str.length()-1; i>=0;i--) {
				result +=str.charAt(i);
			}
			return result;
		};
		
		System.out.println(reverseString.reverseString("bat"));
		
				
		//Genric Lambda Function
		ReverseFunction<Integer> reverseInt = (n) -> {
			int rev = 0;
			while (n != 0) {
				rev = (rev * 10) + n % 10;
				n = n / 10;
			}
			return rev;
		};
		System.out.println(reverseInt.reverse(1981));
		
		ReverseFunction<String> revString = (str) -> {
			String result = "";
			for(int i=str.length()-1; i>=0;i--) {
				result +=str.charAt(i);
			}
			return result;
		};
		
		System.out.println(revString.reverse("1981"));
		
			
		//lambda function as an argument
		String inputString = "java";
		String outputString = "";
		
	/*	outputString = stringOperation((str) -> str.toUpperCase(), inputString);
		System.out.println("print uppercase of the string " + outputString); */
		
		//this passes a block lambda the removes spaces
		inputString = "Java world keep rocking";
		outputString = stringOperation((str,wd) -> {String result = "";
		for(int i = 0; i<str.length();i++)
			if (str.charAt(i)!=' ')
				result += str.charAt(i);
			return result;
		}, inputString,"");
		
		System.out.println("Spaces removed " + outputString);
		
		outputString = stringOperation((str,wd) -> {String result = "";
		String [] word = str.split("\\s+");
		System.out.println(word.length);
		for(int i = 0; i<word.length;i++)
			if (word[i].equalsIgnoreCase(wd))
				return word[i];
			return "Not Found";
		}, "Java world is rocking", "Java");
		
		System.out.println("The word: " + outputString);
		/*	
		//passing the lambda function here as an argument
		StringFunction reverseStr = (str) -> {
			String result = "";
			for(int i=str.length()-1; i>=0;i--) {
				result +=str.charAt(i);
			}
			return result;
		};
		System.out.println("Reverse the string: " + stringOperation(reverseStr, "LOVE"));
	
		//Exception with lambda
		Double [] values = {1.0,2.0,3.0,4.0};
		NumericArrayFunction<Double> average = (n) -> {
			double sum = 0;
			if (n.length == 0)
				throw new EmptyArrayException();
			for(int i=0; i < n.length; i++)
				sum += n[i];
			return sum/n.length;
		};
		
		System.out.println("The average is " + average.function(values));
		System.out.println("Exception thrown " + average.function(new Double[0])); */
	}
	
	
	public static String stringOperation(StringFunction sf, String s, String w) {
		return sf.function(s,w);
	}
}
