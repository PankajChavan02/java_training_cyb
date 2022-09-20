package com.cybage.problems;

public class Factorial {
	
	static int factorial(int num) {
		if(num<=1) return 1;		
		return num*factorial(num-1);
		
	}
	
	static int fibonacci(int num) {
		if(num==0 ) return 0;
		if(num==1 || num==2) return 1;		
		return fibonacci(num-2)+fibonacci(num-1);
	}
	
	
	static String reverseString(String str) {
		
		StringBuilder builder = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			builder.append(str.charAt(i));
			
		}
		return builder.toString();
	}
	
	public static void main(String[] args) {
		//System.out.println(factorial(5));
//		for(int i=0;i<10;i++) {
//			System.out.print(fibonacci(i)+"->");
//		}
		System.out.println(reverseString("Hello world"));
	}

}
