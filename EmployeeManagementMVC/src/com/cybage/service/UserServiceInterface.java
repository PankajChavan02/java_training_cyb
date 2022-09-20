package com.cybage.service;

import java.util.List;

import com.cybage.model.Employee;

public interface UserServiceInterface {
	
	public List<Employee> getEmployees();
	
	public boolean deleteEmployeeId(int employeeId);

}
