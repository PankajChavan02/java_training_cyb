package com.cybage.utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	//public static Connection connection = null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		//if(connection == null ) {
		Connection	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_management_system","root","mymanager");
		//}
		return connection;
	}

}
