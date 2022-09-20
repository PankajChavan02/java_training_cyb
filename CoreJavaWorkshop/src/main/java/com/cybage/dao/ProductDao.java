package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cybage.model.Product;
import com.cybage.utility.ConnectionClass;

public class ProductDao {
	

	public void addProduct(Product product) {
		try(Connection connection = ConnectionClass.getConnection(); 
				PreparedStatement prepareStatement = connection.prepareStatement("insert into product(name,price,category) values (?,?,?)");
				){
			prepareStatement.setString(1, product.getName());
			prepareStatement.setDouble(2, product.getPrice());
			prepareStatement.setString(3, product.getCategory());
			prepareStatement.executeUpdate();
			System.out.println("success");		
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	
	public void getAllProducts() {
		try(Connection connection = ConnectionClass.getConnection();
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery("select * from product");
				){
			System.out.println();
			while(result.next()) {
				
				System.out.printf(" Id: %d  Name: %-15s  Category: %-15s Price: %f ",result.getInt(1),result.getString(2),result.getString(4),result.getDouble(3));
		        System.out.println();
			}
			
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

    public void deleteProductById(int id) {
    	try(Connection connection = ConnectionClass.getConnection(); 
				PreparedStatement prepareStatement = connection.prepareStatement("delete from product where id = ?");
				){
    		prepareStatement.setInt(1, id);
    		prepareStatement.executeUpdate();
    		System.out.println("deleted successfully !!!");
    		
    	}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
    	
    }

    public void updateProduct(Product product,int id) {
    	try(Connection connection = ConnectionClass.getConnection(); 
				PreparedStatement prepareStatement = connection.
						prepareStatement("update product set name =?,price =? where id=?");
				){
			prepareStatement.setString(1, product.getName());
			prepareStatement.setDouble(2, product.getPrice());
			prepareStatement.setInt(3, id);
			prepareStatement.executeUpdate();
			System.out.println("success");		
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
    	
    }

    public void getProductByName(String productName) {
    	try(Connection connection = ConnectionClass.getConnection(); 
    			Statement statement = connection.createStatement();
    			ResultSet result = 	statement.executeQuery("select * from product where name like '%"+productName+"%'");  			
				){
    		
    		System.out.println();
			while(result.next()) {
				
				System.out.printf(" Id: %d  Name: %-15s  Category: %-15s Price: %f ",result.getInt(1),result.getString(2),result.getString(4),result.getDouble(3));
		        System.out.println();
			} 
    		
    			   			
    		   			
    	}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
}

    public void getProductByPrice(double minPrice, double maxPrice) {
    	try(Connection connection = ConnectionClass.getConnection(); 
				PreparedStatement prepareStatement = connection.prepareStatement("select * from product where price between ? and ?");    			
				){
    		prepareStatement.setDouble(1, minPrice);
    		prepareStatement.setDouble(2, maxPrice);
    		try(ResultSet result = 	prepareStatement.executeQuery();){
    			System.out.println();
    			while(result.next()) {				
    				System.out.printf(" Id: %d  Name: %-15s  Category: %-15s Price: %f ",result.getInt(1),result.getString(2),result.getString(4),result.getDouble(3));
    		        System.out.println();
    			}
    		}	
    	}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
    }
    

}
