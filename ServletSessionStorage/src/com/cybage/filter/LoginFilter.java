package com.cybage.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/Login")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
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

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
