package com.cybage.ExceptionHandling;



public class Exception {
	
	
	public static void show() {
		throw new NullPointerException("nullpointer exception is created .");
	}

	public static void main(String[] args) {
		
		try {
			show();
		}
		catch(ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
