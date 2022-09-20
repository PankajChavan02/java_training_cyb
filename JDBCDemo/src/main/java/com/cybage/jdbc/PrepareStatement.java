package com.cybage.jdbc;

import java.sql.*;
import com.mysql.*;



import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Connection;

public class PrepareStatement {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet result = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","mymanager");
			prepareStatement = connection.prepareStatement("insert into student (name,address,marks,dob) values(?,?,?,?)");
			prepareStatement.setString(1, "Varun");
			prepareStatement.setString(2, "Ank");
			prepareStatement.setInt(3, 75);
			//new Date(0).valueOf(LocalDate.of(1996,07,19))
			
			prepareStatement.setString(4,"1996-07-19");
			System.out.println("Success : "+prepareStatement.executeUpdate());
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(result!=null)
					result.close();
				if(prepareStatement!=null)
					prepareStatement.close();
				if(connection!=null)
					connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		

	}

}
