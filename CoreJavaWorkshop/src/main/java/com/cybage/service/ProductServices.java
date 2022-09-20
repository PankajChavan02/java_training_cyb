package com.cybage.service;

import com.cybage.dao.ProductDao;
import com.cybage.model.Product;


public class ProductServices {
	
	ProductDao productOperations = new ProductDao();
	
	public void addProduct(Product product) {
		productOperations.addProduct(product);
	}
	
	public void getAllProducts() {
		productOperations.getAllProducts();
	}

    public void deleteProductById(int id) {
    	productOperations.deleteProductById(id);
    	
    }

    public void updateProduct(Product product,int id) {
    	productOperations.updateProduct(product, id);
    	
    }

    public void getProductByName(String productName) {
    	productOperations.getProductByName(productName);
    }
    
    public void getProductByPrice(double minPrice,double maxPrice) {
    	productOperations.getProductByPrice(minPrice, maxPrice);
    }

}
