package com.cybage.introductiontojava;

// Write a program to demonstrate different access modifiers 



public class AccessModifiersExample {

	public static void main(String[] args) {
		DemoForAccessModifiers instance = new DemoForAccessModifiers();
		System.out.println("public var : "+instance.publicVar);
		System.out.println("protected var : "+instance.protectVar);
		
		//private member are not accessible outside the class in which it is declared
		//System.out.println("private var : "+instance.privateVar);
		
		System.out.println("default var : "+instance.defaultvar);
	}

}
