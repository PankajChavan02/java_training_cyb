package com.cybage.servlet.assignment;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sum
 */
public class Sum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> names = request.getParameterNames();
		int sum = 0;
		
		System.out.println("Inside sum servlet");
		
		
		while(names.hasMoreElements()) {
			String name = names.nextElement();
		
			int value = Integer.parseInt(request.getParameter(name));
			sum = sum + value;
		}
		
		System.out.println("sum = "+sum);
		request.setAttribute("result", sum);
		RequestDispatcher disp = request.getRequestDispatcher("result");
		disp.forward(request, response);
	
	}

}
