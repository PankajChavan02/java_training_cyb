package com.cybage.library.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.library.model.Book;

public class BookDao {
	
	
	public boolean deleteBook(int id) {
		try(
				Connection connection = ConnectionClass.getConnection();
				PreparedStatement prepareStatement = connection.prepareStatement("delete from books where id = ?");				
				){
			prepareStatement.setInt(1, id);
			prepareStatement.executeUpdate();
			return true;
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean addBook(Book book) {
		try(
				Connection connection = ConnectionClass.getConnection();
				PreparedStatement prepareStatement = connection.prepareStatement("insert into books values(default,?,?,?)");
				){
			prepareStatement.setString(1, book.getBookName());
			prepareStatement.setString(2, book.getAuthor());
			prepareStatement.setInt(3, book.getPages());
			prepareStatement.executeUpdate();
			return true;
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
	}

	public List<Book> allBooks() {
		List<Book> bookList = new ArrayList<>();
		try(
				Connection connection = ConnectionClass.getConnection();
				Statement statement = connection.createStatement();
				ResultSet result =  statement.executeQuery("select * from books");
				){
			
			while(result.next()) {
				Book book = new Book(result.getString(2), result.getString(3), result.getInt(4));
				bookList.add(book);
			}
			return bookList;
			
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			return bookList;
		}
	}
	
}
