package com.cybage.oppsconcept;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/*Write a program to create a class named EmployeeDetails and display a menu similar to the following menu: 
--------------Menu--------------
1. Enter Data
2. Display Data
3. Exit

Choose the option
Thereafter, invoke the respective method according to the given menu input. The methods 
will contain appropriate message, such as the displayData()
method will contain the message, displayData method is invoked

*/

class EmployeeDetails {
	private String name;
	private int employeeId;
	private LocalDate dateOfJoining;
	private String designation;
	public EmployeeDetails(String name, int employeeId, LocalDate dateOfJoining, String designation) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.dateOfJoining = dateOfJoining;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", employeeId=" + employeeId + ", dateOfJoining=" + dateOfJoining
				+ ", designation=" + designation + "]";
	}
	
	
}

public class EmployeeDetailsProblem {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static int menu() {
		int choice;
		//accept choice from user
		while(true) {
		System.out.println();
		System.out.println("Enter choice : ");
		System.out.println("1. Enter Data");
		System.out.println("2. Display Data");
		System.out.println("0. Exit ");
		
			choice = scanner.nextInt();
			if(choice>=0 && choice <3) return choice;
			else System.out.println("Ente correct choice : ");
		}
		
	}
	

	public static void main(String[] args) {
		int choice;
		String name,designation;
		int employeeId;
		LocalDate dateOfJoining;
		
		ArrayList<EmployeeDetails> list = new ArrayList<>();
		do {
		choice = menu();
		switch(choice) {
		case 1://enter data
			scanner.nextLine();
			System.out.println("Enter name                        : ");
			name = scanner.nextLine();
			
			System.out.println("Enter employeeId                  : ");
			employeeId = scanner.nextInt();
			
			System.out.println("Enter date of joining dd  mm yyyy : ");
			int day = scanner.nextInt();
			int month = scanner.nextInt();
			int year = scanner.nextInt();
			dateOfJoining = LocalDate.of(year,month,day);
			
			scanner.nextLine();
			System.out.println("Enter designation                 : ");
			designation = scanner.nextLine();
			//create employee details object
			EmployeeDetails employee = new EmployeeDetails(name, employeeId, dateOfJoining, designation);
			//adding employee details object to list
			list.add(employee);
			break;
			
		case 2: //show data
			System.out.println("Employee list is as follows : ");
			for(EmployeeDetails employee1 : list) {
				System.out.println(employee1);
			}
			
		}
		}while(choice != 0);
		
		System.out.println();
		System.out.println("Exit successful");

	}

}
