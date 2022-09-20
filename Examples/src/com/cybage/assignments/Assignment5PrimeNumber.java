package com.cybage.assignments;

import java.util.Scanner;

public class Assignment5PrimeNumber {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0) {
				System.out.println(num+" is not a prime number . ");
				return;
			}
		}
		
		System.out.println(num+" is a prime number . ");

	}

}
