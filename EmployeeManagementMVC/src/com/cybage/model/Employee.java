package com.cybage.model;

import java.time.LocalDate;

public class Employee {
	private Integer employeeId;
	private String employeeName;
	private LocalDate dateOfJoining;
	private double salary;
	
	
	public Employee(Integer employeeId, String employeeName, LocalDate dateOfJoining, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", dateOfJoining=" + dateOfJoining + ", salary=" + salary
				+ "]";
	}
	
	

}
