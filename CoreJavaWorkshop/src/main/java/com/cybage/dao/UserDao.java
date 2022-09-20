package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.cybage.model.User;
import com.cybage.utility.ConnectionClass;

public class UserDao {
	
	public User getUsers(String userName,String password){
		User user = null;
		
		try( Connection connection = ConnectionClass.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("select * from user where user_name= ? and password = ?;");				
				){	
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			
			try(ResultSet result = preparedStatement.executeQuery();){
				
				while(result.next()) {
				   user = new User(result.getString(2), result.getString(3), result.getString(4));	
				}
				
			}
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
		return user;
		
	}

}
