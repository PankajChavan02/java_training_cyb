package com.cybage.assignment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.cybage.assignment.model.User;



public class UserDao {
	
	public User getUser(User user) {
		try(Connection connection = ConnectionClass.getConnection();
				PreparedStatement statement = connection.prepareStatement("select * from user where user_name =? and password =?");
				){
			User newUser  = null;
			System.out.println("inside dao");
			
		        statement.setString(1, user.getName());
				statement.setString(1, user.getPassword());
				try(ResultSet result = statement.executeQuery();){
					while(result.next()) {
						newUser = new User(result.getString(2), result.getString(3), result.getString(4), LocalDate.parse(result.getString(5)));
						
						
					}
					System.out.println(newUser);
					return newUser;
				} 
		
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean addUser(User user) {
		try(Connection connection = ConnectionClass.getConnection();
				PreparedStatement statement = connection.prepareStatement("insert into user values(default,?,?,?,?)");
				){
			statement.setString(1,user.getName());
			statement.setString(2,user.getPassword());
			statement.setString(3, user.getDate().toString());
			statement.setString(4, user.getMobile());
			System.out.println("in dao "+user);
			statement.executeUpdate();
			return true;
			
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
