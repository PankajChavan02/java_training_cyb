package com.cybage.assignments;

import java.util.Scanner;



public class Assignment2Account {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int menu() {
		System.out.println("1. deposit");
		System.out.println("2. withdraw");
		System.out.println("3. check balance");
		System.out.println("0. exit");
		return sc.nextInt();
	} 

	public static void main(String[] args) {
		Account acc = new Account();
		int choice;
		do {
			choice = menu();			
			
			switch(choice){
			case 1: System.out.println("Enter amount to be deposited in double : ");
			         acc.deposit(sc.nextDouble());
			         break;
			case 2: System.out.println("Enter amount to be withdrawn in double : ");
			         acc.withdraw(sc.nextDouble());  
			         break;
			case 3: System.out.println("Your current balance is : "+Account.balance);
		            break;
		   
			}
			
		}while(choice!=0);
		
		
//		System.out.println("Initial balance : "+Account.balance);
//		
//		Account acc = new Account();
//		
//		//deposite 10000rs into the act
//		System.out.println("10000 rs added into the account  ");
//		acc.deposit(10000.0);
//		
//		System.out.println("Current balance : "+Account.balance);
//		
//		System.out.println("3000 rs withdrawn into the account  ");
//		acc.withdraw(3000.0);
//		
//		System.out.println("Current balance : "+Account.balance);
//		
		
		

	}

}
