package com.cybage.fundamentalsofjava1;

import java.util.Scanner;



/*Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
 Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
*/

public class SumOfIntegerProblem {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int givenNumber,sum=0,tempNumber;
		
		System.out.println("Enter a number between 0 and 1000");
		
		//accept a number
		while(true) {
			givenNumber = scanner.nextInt();
			if(givenNumber>0 && givenNumber<1000)
				break;
		}
		tempNumber = givenNumber;
		
		//calculate sum of digits of given number
		while(tempNumber%10!=0) {
			sum+=tempNumber%10;
			tempNumber = tempNumber/10;
		}
		
		//print the result
		System.out.println("The sum of all digits in "+givenNumber+" is "+sum);

	}

}
