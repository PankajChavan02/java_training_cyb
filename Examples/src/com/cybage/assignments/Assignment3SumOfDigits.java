package com.cybage.assignments;

import java.util.Scanner;

public class Assignment3SumOfDigits {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		System.out.println();
		while(num%10!=0) {
//			System.out.println(num%10);
			sum = sum + num%10;
			num = num/10;
		}
		
		System.out.println("Sum of digit is : "+sum);
		
		

	}

}
