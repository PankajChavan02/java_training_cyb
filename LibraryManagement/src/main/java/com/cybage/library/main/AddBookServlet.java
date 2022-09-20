package com.cybage.library.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.library.model.Book;
import com.cybage.library.service.BookService;

/**
 * Servlet implementation class AddBookServlet
 */
public class AddBookServlet extends HttpServlet {
	
	public static BookService bookService = new BookService();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet() 
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = new Book("Yugandhar", "Shivaji Sawant", 500);
		
		System.out.println(bookService.addBook(book)+" result ");
    }
    
  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     String bookName = request.getParameter("name");
		     String author = request.getParameter("author");
		     int pages = Integer.parseInt(request.getParameter("pages"));
		
		     Book book = new Book(bookName, author, pages);
			
			System.out.println(bookService.addBook(book)+" result ");
	}

}
