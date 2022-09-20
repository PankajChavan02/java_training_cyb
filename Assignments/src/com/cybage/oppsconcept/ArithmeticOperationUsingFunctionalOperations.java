package com.cybage.oppsconcept;

/**
 * Write a functional interface for arithmetic operation.
 * Implement functional interface using lambda expression for different operations.  
*/


//user defined functional interface
@FunctionalInterface
interface Operation{
	public double operateOn(double number1,double number2);
}

public class ArithmeticOperationUsingFunctionalOperations {

	public static void main(String[] args) {		
		
		//passing lambda expression to calculate sum of two numbers
		Operation sum = (number1,number2)-> number1+number2;
		System.out.println(" 35.0 + 25.0 = "+sum.operateOn(35,25));
		
		//passing lambda expression to calculate difference of two numbers
		Operation difference = (number1,number2)-> number1-number2;
		System.out.println(" 35.0 - 25.0 = "+difference.operateOn(35,25));
		
		//passing lambda expression to calculate multiplication of two numbers
		Operation multiplication = (number1,number2)-> number1*number2;
		System.out.println(" 25.0 * 35.0 = "+multiplication.operateOn(35,25));
		
		//passing lambda expression to calculate division of two numbers
		Operation division = (number1,number2)-> number1/number2;
		System.out.println(" 25.0 / 5.0 = "+division.operateOn(25,5));
	}

}
