package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import com.cybage.model.Employee;

public class UserDao {
	int noOfRecordsChanged = 0;
	
	public List<Employee> getEmployees(){
		List<Employee> listEmployee = new ArrayList<Employee>();
		try(
				Connection connection = ConnectionUtils.getConnection();
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery("select * from employees");
				){
			
			
			while(result.next()) {
				listEmployee.add(new Employee(result.getInt(1), result.getString(2), LocalDate.parse(result.getDate(3).toString()), result.getDouble(4)));				
			}
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return listEmployee;
	}

	public boolean deleteEmployee(int employeeId) {
		try(
				Connection connection = ConnectionUtils.getConnection();
				PreparedStatement prepareStatement = connection.prepareStatement("delete from employees where employee_id = ?");
				){
			prepareStatement.setInt(1, employeeId);
			noOfRecordsChanged = prepareStatement.executeUpdate();			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return noOfRecordsChanged>0?true:false;
	}
}
