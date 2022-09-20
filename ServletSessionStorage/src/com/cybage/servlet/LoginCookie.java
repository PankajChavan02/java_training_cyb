package com.cybage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginCookie")
public class LoginCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCookie() {
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
        	 Cookie ck = new Cookie("userName", name);
        	 response.addCookie(ck);
        	  response.sendRedirect("WelcomeCookie");
        	  
          }else {
        	  out.append("Password or username is incorrect ");
        	  RequestDispatcher dispatcher = request.getRequestDispatcher("form.html");
        	  dispatcher.include(request, response);
        	  
          }
          
          
	}


}
