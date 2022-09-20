package com.cybage.assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.bean.User;

/**
 * Servlet implementation class ListEmployee
 */
@WebServlet("/ListEmployee")
public class ListEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> employeeList = new ArrayList<>();
		User employee1 = new User("pankaj", "pune", "pan@gmail.com");
		User employee2 = new User("viru", "pune", "viru@gmail.com");
		employeeList.add(employee1);
		employeeList.add(employee2);
		request.setAttribute("employeeList", employeeList);
		request.setAttribute("breakTag", "<br>");
		RequestDispatcher dispatcher = request.getRequestDispatcher("employee.jsp");
		dispatcher.forward(request, response);
		
	}

}
