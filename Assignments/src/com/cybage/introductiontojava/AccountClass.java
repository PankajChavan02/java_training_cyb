package com.cybage.introductiontojava;

//Create account class with different types of constructors

class Account{
	private double balance;
	private String type;
	
	//parameterless constructor, if you do not declare any constructor this will be provided by JVM
	public Account(){
		System.out.println("parameterless constructor");
	}

	//parameterized constructor
	public Account(double balance, String type) {
		super();
		this.balance = balance;
		this.type = type;
	}
	

	
}

public class AccountClass {

	public static void main(String[] args) {


	}

}
