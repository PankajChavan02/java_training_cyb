package com.cybage.service;

import java.util.List;

import com.cybage.dao.ProductDao;
import com.cybage.model.Product;


public class ProductServices {
	
	ProductDao productOperations = new ProductDao();
	
	public void addProduct(Product product) {
		productOperations.addProduct(product);
	}
	
	public List<Product> getAllProducts() {
		return productOperations.getAllProducts();
	}

    public void deleteProductById(int id) {
    	productOperations.deleteProductById(id);
    	
    }

    public void updateProduct(Product product,int id) {
    	productOperations.updateProduct(product, id);
    	
    }

    public List<Product> getProductByName(String productName) {
    	return productOperations.getProductByName(productName);
    }
    
    public void getProductByPrice(double minPrice,double maxPrice) {
    	productOperations.getProductByPrice(minPrice, maxPrice);
    }
    
    public Product getProductByProductId(int id) {
    	return productOperations.getProductById(id);
    }

}
