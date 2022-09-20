package com.cybage.assignment3;

import java.util.Scanner;

public class Assignment2NumberFormatException {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String name;
		
			
		for(int i=0;i<2;i++) {
			System.out.println();
			System.out.println("Enter name of student : ");
			name = scanner.nextLine();
			int sum = 0;
			int marks = 0;
			String marksString;
			
			for(int j=0;j<3;j++) {
				System.out.println("Enter marks of "+j+" th subject ");
				while(true) {
				try {
					marksString = scanner.nextLine();
					marks=Integer.parseInt(marksString);
					sum = sum +marks;					
					break;
				}catch(Exception e) {
					System.out.println("Please enter numbers only for !!!!");
				}
			}
			}
			System.out.println();
			System.out.println(name + " your average marks are "+sum/3);
			
			
			
		}
	}

}
