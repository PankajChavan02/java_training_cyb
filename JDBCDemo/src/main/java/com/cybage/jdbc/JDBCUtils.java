package com.cybage.jdbc;

import java.sql.*;


public class JDBCUtils {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","mymanager");
			return connection;
		
	}

}
