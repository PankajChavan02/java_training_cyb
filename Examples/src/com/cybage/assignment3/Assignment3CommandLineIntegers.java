package com.cybage.assignment3;

public class Assignment3CommandLineIntegers {

	public static void main(String[] args) {
		
		int sum = 0,number;
		
		try {
		for(int i = 0;i<args.length;i++) {
			number = Integer.parseInt(args[0]);
			sum = number + sum;
		}
		}
		catch(ArrayIndexOutOfBoundsException|ArithmeticException|NumberFormatException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Sum of all integers is : "+sum);
		System.out.println("Avg of all integers is : "+sum/args.length);

	}

}
