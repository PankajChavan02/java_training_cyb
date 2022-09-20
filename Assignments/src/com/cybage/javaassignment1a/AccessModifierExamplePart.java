package com.cybage.javaassignment1a;
import com.cybage.introductiontojava.DemoForAccessModifiers;;

// Write a program to demonstrate different access modifiers 


public class AccessModifierExamplePart {

	public static void main(String[] args) {
		DemoForAccessModifiers instance = new DemoForAccessModifiers();
		System.out.println("public var : "+instance.publicVar);
		
		//protect member world like public in same package and
		//can be accessed in other package by extending that class		
		//System.out.println("protected var : "+instance.protectVar);
		
		//private member are not accessible outside the class in which it is declared
		//System.out.println("private var : "+instance.privateVar);
		
		//default member is only accessible in same package
		//System.out.println("default var : "+instance.defaultvar);
	}

}
