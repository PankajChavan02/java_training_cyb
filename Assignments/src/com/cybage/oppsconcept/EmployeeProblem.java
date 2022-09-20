package com.cybage.oppsconcept;

/*Create a class hierarchy:  Employee
                                               Manager
                                               SalesManager
 Override calculateSalary() method.  Manager  will have allowance field &
SalesManager will have  commission field.
*/


// Employee class
class Employee{
	private String name;
	private int employeeId;
	private double basicSalary;
	
	public Employee(String name, int employeeId, double basicSalary) {		
		this.name = name;
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
	}



	public double getSalary() {
		return basicSalary;
	}
}

// manager class
class Manager extends Employee{
	private double allowance;
	
	public Manager(String name, int employeeId, double basicSalary,double allowance) {
		super(name,employeeId,basicSalary);
		this.allowance = allowance;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + this.allowance;
	}
}


//Sales manager class
class SalesManager extends Employee{
	private double commission;
	
	public SalesManager(String name, int employeeId, double basicSalary,double commission) {
		super(name,employeeId,basicSalary);
		this.commission = commission;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + this.commission;
	}
}


public class EmployeeProblem {

	public static void main(String[] args) {
		Employee employee = new Employee("employee1", 12520, 30000.00);
		System.out.println("Employee get salary result : "+employee.getSalary());
		
		Manager manager = new Manager("manager1", 12522, 30000.00, 10000.00);
		System.out.println("Manager get salary result : "+manager.getSalary());
		
		SalesManager salesManager = new SalesManager("manager1", 12522, 30000.00, 20000.00);
		System.out.println("Sales Manager get salary result : "+salesManager.getSalary());
	}

}
