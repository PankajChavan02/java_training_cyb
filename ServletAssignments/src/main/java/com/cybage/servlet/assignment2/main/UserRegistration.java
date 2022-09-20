package com.cybage.servlet.assignment2.main;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.servlet.assignment2.model.User;
import com.cybage.servlet.assignment2.service.UserService;

/**
 * Servlet implementation class UserRegistration
 */
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//    /user/add
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		LocalDate date = LocalDate.parse(request.getParameter("dob"));
		String mobile = request.getParameter("mobile");
		
		User user = new User(userName, password, mobile, date);
		UserService service = new UserService();
		
		System.out.println(user);
				
		System.out.println(service.AddUser(user)+" ");
	}

}
