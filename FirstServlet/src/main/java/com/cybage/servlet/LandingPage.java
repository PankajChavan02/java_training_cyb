package com.cybage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LandingPage
 */
public class LandingPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LandingPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        
        if((name.equals("admin"))&& pwd.equals("admin")) {
      	  RequestDispatcher dispatcher = request.getRequestDispatcher("Welcome");
      	  dispatcher.forward(request, response);
        }else {
      	  out.append("Password or username is incorrect ");
      	  RequestDispatcher dispatcher = request.getRequestDispatcher("form.html");
      	  dispatcher.include(request, response);
      	  
        }
        
        
	}

}
