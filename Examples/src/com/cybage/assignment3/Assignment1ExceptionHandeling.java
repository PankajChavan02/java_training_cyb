package com.cybage.assignment3;

import java.util.Scanner;

class ExceptinoWhileDataEntry extends Exception{
	private static final long serialVersionUID = 1L;

	public ExceptinoWhileDataEntry(String message) {
		super(message);
	}
}

public class Assignment1ExceptionHandeling {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter your name : ");
	    String name = sc.nextLine();	  
	    int age;
		while(true) {
			
			try {
				System.out.println("Enter age : ");
				age = sc.nextInt();
				if(age <18) throw new ExceptinoWhileDataEntry("Age must be above 18... please enter again!!!!!");
				else if( age >=60 ) throw new ExceptinoWhileDataEntry("Age must be below 60 ... please enter again!!!!!");
				else break;				
			}
			catch(ExceptinoWhileDataEntry e ) {
				System.out.println(e.getMessage());
			}		
			
			
		}
		
		System.out.println();
		System.out.println("Your inputs are : ");
		System.out.println("Name : "+name+"   age: "+age);
		
		
	}
}
