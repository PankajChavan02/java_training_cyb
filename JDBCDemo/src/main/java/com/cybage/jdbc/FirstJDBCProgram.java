package com.cybage.jdbc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBCProgram {

	public static void main(String[] args) {
		
	
		try(
				Connection connection = JDBCUtils.getConnection();
				Statement statement = connection.createStatement();
				ResultSet result =  statement.executeQuery("select * from student");
				){	
				while(result.next()) {
					System.out.printf("ID:%d Name:%-8s Addr: %-6s Marks:%d   Date:%s",result.getInt(1),result.getString(2),result.getString(3),result.getInt(4),result.getDate(5));

					System.out.println();
				}				
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
