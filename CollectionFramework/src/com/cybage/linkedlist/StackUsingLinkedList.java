package com.cybage.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

import javax.naming.event.NamespaceChangeListener;

public class StackUsingLinkedList {
	public static Scanner scanner = new Scanner(System.in);
	
	public static int menu() {
		System.out.println("1. push ");
		System.out.println("2. pop ");
		System.out.println("3. pull ");
		System.out.println("4. display ");
		System.out.println("0. exit");
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		LinkedList<String> nameList = new LinkedList<>();
		
	 		
		do {
			choice = menu();
			switch(choice) {
			
			case 1: System.out.println("Enter data to be added : ");
			scanner.nextLine();
			nameList.addLast(scanner.nextLine());
			break;
			
			case 2: 
				System.out.println(nameList.removeLast());
				break;
			 
			case 3: 
				System.out.println(nameList.getLast());
				break;
			
			case 4 : System.out.print(" Elements are : ");
				for(String name : nameList) {
					System.out.print(" "+name);
				}
					System.out.println();
			}
			
		}while(choice!=0);
		

	}

}
