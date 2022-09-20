package com.cybage.jdbc;

import java.sql.*;
import com.mysql.*;



import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Connection;

public class StoredProcedure {

	public static void main(String[] args) {
		Connection connection = null;
		CallableStatement callableStatement = null;
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","mymanager");
			callableStatement = connection.prepareCall("{call get_name(?,?)}");
			callableStatement.setInt(1, 5);
			callableStatement.registerOutParameter(2,Types.VARCHAR);
			callableStatement.execute();
			
			
			System.out.println(callableStatement.getString(2));
			
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			try {				
				if(callableStatement!=null)
					callableStatement.close();
				if(connection!=null)
					connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		

	}

}
