package com.cybage.main;


import java.util.Scanner;

import com.cybage.model.Product;
import com.cybage.model.User;
import com.cybage.service.ProductServices;
import com.cybage.service.UserService;

public class Main {
	
	public static ProductServices productService = new ProductServices();
	public static UserService userService = new UserService();
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String username;
		String password;	
		
		System.out.print("Enter username : ");
		username = scanner.nextLine();
		System.out.print("Enter password : ");
		password = scanner.nextLine();		
		User user= userService.getUsersByNameAndPassword(username,password);
		if(user.getType().equals("A")) {
			adminFunctionality();
		}else userFunctionality();
	}
	
	public static int menuForUser() {
		int choice;
		
		while(true) {
		System.out.println();
		System.out.println("1. view all products");
		System.out.println("2. search by name ");
		System.out.println("3. search by price range ");
		System.out.println("0. Exit");
		choice = scanner.nextInt();
		if((choice<=3) && (choice>=0)) return choice;
		}
		
	}
	
	public static Product getProduct() {
		String name;
		String category;
		double price;		
			System.out.println();
			scanner.nextLine();
			System.out.print("Enter name     : ");
			name=scanner.nextLine();
			System.out.print("Enter price    : ");
			price = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Enter category : ");
			category = scanner.nextLine();
			
		return new Product(name, price, category);
	} 
	
	public static int menuForAdmin() {
		int choice;
		while(true) {		
			System.out.println();
			System.out.println("1. Add product");
			System.out.println("2. Update product");
			System.out.println("3. Delete product");
			System.out.println("4. View all products");
			System.out.println("0. Exit ");
		     
			choice = scanner.nextInt();
			
		    if ((choice>=0) && (choice<=4)) return choice;
		    
		    System.out.println("wrong choice try again");			
		}
		
	}

	public static void adminFunctionality() {
		int choice ;
		String updatedName;
		double updatedPrice;
		int produtId;
		
		
		
		do {
			//accept user choice
			choice=menuForAdmin();
			
			
			
			switch(choice) {
			
			case 1: //add product
				Product newProduct = getProduct();
				productService.addProduct(newProduct);				
				break;
				
			case 2: //update product
				System.out.println();
				System.out.print("Enter id of product to be edited : ");
				produtId = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter updated name : ");
				updatedName = scanner.nextLine();
				System.out.print("Enter updated price : ");
				updatedPrice = scanner.nextDouble();
				Product product = new Product(updatedName, updatedPrice, "");
				productService.updateProduct(product, produtId);
				break;
				
			case 3: //delete product
				System.out.print("Enter product id you want to delete : ");
				produtId = scanner.nextInt();
				productService.deleteProductById(produtId);
				break;
				
			case 4: //display all
				productService.getAllProducts();
				
				
			}
			
		}while(choice!=0);
	}
	
	public static void userFunctionality() {
		int choice;
		String productName;
		double minPrice;
		double maxPrice;
		
		do {
			choice = menuForUser();
			switch(choice){
			case 1: //view all products
				productService.getAllProducts();
				break;
			case 2://search by name	
				scanner.nextLine();
				System.out.print("Enter name of product : ");
				productName = scanner.nextLine();
				productService.getProductByName(productName);
				break;
			case 3://search by price range
				System.out.print("Enter minimum price of product : ");
				minPrice = scanner.nextDouble();
				System.out.print("Enter maximum price of product : ");
				maxPrice = scanner.nextDouble();
				productService.getProductByPrice(minPrice, maxPrice);
				break;				
			}			
			
		}while(choice!=0);
	}
	
	
	
}
