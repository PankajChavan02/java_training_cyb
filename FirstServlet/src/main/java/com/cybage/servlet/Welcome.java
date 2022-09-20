package com.cybage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("userName");
		out.append("Welcome "+username);
	}
	
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	javax.servlet.ServletContext context = getServletContext();
	String user = (String) context.getAttribute("user");
		context.removeAttribute("user");
		PrintWriter out = response.getWriter();
		
		out.append("Welcome in get method : "+user);
	}

}
