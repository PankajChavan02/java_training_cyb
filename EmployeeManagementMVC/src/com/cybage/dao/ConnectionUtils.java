package com.cybage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","mymanager");

		return connection;
	}
	
	

}
