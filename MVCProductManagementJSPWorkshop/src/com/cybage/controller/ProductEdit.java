package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.Product;
import com.cybage.model.User;
import com.cybage.service.ProductServices;

/**
 * Servlet implementation class ProductDelete
 */
@WebServlet("/ProductEdit")
public class ProductEdit extends HttpServlet {
	public static ProductServices productService = new ProductServices();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductEdit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		List<Product> productList = null; 
		int productId = Integer.valueOf(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		double productPrice = Double.parseDouble(request.getParameter("productPrice"));
		String productCategory = request.getParameter("productCategory");
		
		Product product = new Product(productId, productName, productPrice, productCategory);
		productService.updateProduct(product, productId);
			
		productList = productService.getAllProducts();		
		request.setAttribute("productList", productList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
		dispatcher.forward(request, response);	
	}

}
