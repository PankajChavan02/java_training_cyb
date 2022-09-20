package com.cybage.fundamentalsofjava1;

import java.util.Scanner;

/*Write a Java program to break an integer into a sequence of individual digits. 
 Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
*/

public class BreakADigitProblem {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void digits(int number,int currentDigit) {
		if(number%10 == 0) return;
		currentDigit = number%10;
		digits(number/10,currentDigit);
		System.out.print(currentDigit+" ");
		
	}


	public static void main(String[] args) {
		System.out.println("Enter number which you want to break into sequence of digits : ");
		int givenNumber = scanner.nextInt();
		int currentDigit = 0;
		digits(givenNumber, currentDigit);
		
	}

}
