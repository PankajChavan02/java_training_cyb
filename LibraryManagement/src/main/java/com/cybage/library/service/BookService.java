package com.cybage.library.service;

import java.util.List;

import com.cybage.library.doa.BookDao;
import com.cybage.library.model.Book;

public class BookService {
	
	public static BookDao bookDao = new BookDao();;
	
	public boolean addBook(Book book) {
		return bookDao.addBook(book);
	}
	
	public boolean deleteBook(int bookId) {
		return bookDao.deleteBook(bookId);
	}
	
	public List<Book> getAllBooks(){
		return bookDao.allBooks();
	}

}
