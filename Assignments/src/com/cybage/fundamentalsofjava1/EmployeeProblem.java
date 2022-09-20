package com.cybage.fundamentalsofjava1;


/*
 * Create a class Employee  & write Accessors & Mutators
Create objects with default constructor & set values using mutators.
Display/print values of attributes of each object created.
*/
class Employee {
	private String name;
	private int employeeId;
	private String designation;
	
	
	//default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("new object created");
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", designation=" + designation + "]";
	}
	
	
	
	
}
public class EmployeeProblem {

	public static void main(String[] args) {
		 Employee employee = new Employee();
		 employee.setName("Pankaj K. Chavan");
		 employee.setDesignation("Software Engineer");
		 employee.setEmployeeId(24863);
		 //System.out.println(employee);
		 System.out.println("Name        : "+employee.getName());
		 System.out.println("Designation : "+employee.getDesignation());
		 System.out.println("Id          : "+employee.getEmployeeId());
		 

	}

}
