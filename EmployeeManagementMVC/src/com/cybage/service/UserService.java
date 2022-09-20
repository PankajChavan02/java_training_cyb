package com.cybage.service;

import java.util.List;

import com.cybage.dao.UserDao;
import com.cybage.model.Employee;

public class UserService implements UserServiceInterface {
	
	public static UserDao userDao = new UserDao();

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return userDao.getEmployees();
	}

	@Override
	public boolean deleteEmployeeId(int employeeId) {
		return userDao.deleteEmployee(employeeId);		
	}
	

}
