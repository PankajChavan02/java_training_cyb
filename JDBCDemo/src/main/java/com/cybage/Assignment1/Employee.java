package com.cybage.Assignment1;

import java.time.LocalDate;

public class Employee {
	private String name;
	private int employeeId;
	private String designation;
	private LocalDate dateOfJoining;
	public Employee(String name, int employeeId, String designation, LocalDate dateOfJoining) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
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
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", designation=" + designation
				+ ", dateOfJoining=" + dateOfJoining + "]";
	}
	
	

}
