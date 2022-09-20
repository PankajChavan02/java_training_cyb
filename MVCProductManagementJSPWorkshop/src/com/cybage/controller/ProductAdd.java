package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Product;
import com.cybage.service.ProductServices;

/**
 * Servlet implementation class ProductAdd
 */
@WebServlet("/ProductAdd")
public class ProductAdd extends HttpServlet {
	
	ProductServices productService = new ProductServices();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductAdd() {
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
		List<Product> productList = null;
		
		String productName = request.getParameter("productName");
		double productPrice = Double.parseDouble(request.getParameter("productPrice"));
		String productCategory = request.getParameter("productCategory");
		
		Product product = new Product(0, productName, productPrice, productCategory);
		productService.addProduct(product);
			
		productList = productService.getAllProducts();		
		request.setAttribute("productList", productList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
		dispatcher.forward(request, response);	
	}

}
