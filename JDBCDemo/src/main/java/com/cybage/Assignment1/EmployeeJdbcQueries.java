package com.cybage.Assignment1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;



public class EmployeeJdbcQueries {
	public static Scanner scanner = new Scanner(System.in);
	
	public static int menu() {
		int choice;
		while(true) {
			System.out.println();
		System.out.println("1. add employee");
		System.out.println("2. see employee");
		System.out.println("3. delete employee");
		System.out.println("4. see all employee");
		System.out.println("0. exit");
		choice = scanner.nextInt();
		if((choice<=4) && (choice>=0)) {
			return choice;
		}
		}
	}
	
	public static Employee getEmployee() {
		
		String name;
		int employeeId;
		String designation="";
		int day;
		int month;
		int year;
		
			System.out.print("Enter employee id : ");
		    employeeId = scanner.nextInt();
		    scanner.nextLine();
			System.out.print("Enter name : ");
	        name = scanner.nextLine();
	        System.out.print("Enter designation : ");
	        designation = scanner.nextLine();
	        System.out.print("Enter date of joinig dd- mm- yyyy : ");
	        day = scanner.nextInt();
	        month = scanner.nextInt();
	        year = scanner.nextInt();
	        
	        return new Employee(name, employeeId, designation, LocalDate.of(year, month, day));	        
		
	}

	public static void printEmployees(ResultSet result) throws SQLException {
		while(result.next()) {
			System.out.printf("employeeId:%d name: %-15s designation: %-15s doj: %s",
					result.getInt(1),result.getString(2),result.getString(3),result.getDate(4));
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int choice;
		int temp;
		
		
		
		try(Connection connection = JdbcUtils.getConnection();
				PreparedStatement insertStatement = connection.prepareStatement("insert into employee values(?,?,?,?)");
				PreparedStatement deleteStatement = connection.prepareStatement("delete from employee where employee_id  = ?");
				PreparedStatement getEmployee = connection.prepareStatement("select * from employee where employee_id  = ?");
				Statement getAllEmployee = connection.createStatement();			
				){
			
			do {
				choice = menu();
				
				switch(choice) {
				
				case 1: Employee employee = getEmployee();
				System.out.println(employee);
				       insertStatement.setInt(1, employee.getEmployeeId());
				       insertStatement.setString(2, employee.getName());
				       insertStatement.setString(3, employee.getDesignation());
				       insertStatement.setString(4, employee.getDateOfJoining().toString());
				       insertStatement.executeUpdate();
				       System.out.println("Inserted success fully ");
				       break;
				       
				case 2:System.out.println(); 
					System.out.println(" Enter employee Id : ");
					temp = scanner.nextInt();
					getEmployee.setInt(1, temp);
					try(ResultSet result = getEmployee.executeQuery();){
						System.out.println();
						printEmployees(result);
						System.out.println();
						
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
					
				case 3:System.out.println(); 
				System.out.println(" Enter employee Id to be deleted : ");
				deleteStatement.setInt(1, scanner.nextInt());
				deleteStatement.executeUpdate();
				System.out.println("deleted successfully !!1");
				break;
					
				case 4:
				System.out.println("Employee list is : ");
				try(ResultSet result = getAllEmployee.executeQuery("select * from employee");){
					System.out.println();
					printEmployees(result);
					System.out.println();					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				}			
				
			}while(choice!=0);			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
