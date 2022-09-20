package com.cybage.assignment.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.assignment.model.User;
import com.cybage.assignment.service.UserService;



/**
 * Servlet implementation class AuthenticateUser
 */
@WebServlet("/AuthenticateUser")
public class AuthenticateUser extends HttpServlet {
	
	private static UserService userService =  new UserService();
			
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = request.getParameter("userName");
         String password = request.getParameter("pwd");         
         User user = new User(name, password, "", LocalDate.now());
         System.out.println("inside auth : "+user);
         
         User userFromDB = userService.getUserFromDb(user);
         System.out.println("inside auth end ");
         if(userFromDB!=null) {
        	 HttpSession httpSession =  request.getSession();
        	 httpSession.setAttribute("userName", name);        
        	 System.out.println("success");
        	  response.sendRedirect("WelcomeSession");
        	  
          }else {
        	  PrintWriter out = response.getWriter();
        	  out.append("Password or username is incorrect ");
        	  RequestDispatcher dispatcher = request.getRequestDispatcher("formSession.html");
        	  dispatcher.include(request, response);        	  
          }
         
         
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
