package com.cybage.api;


interface Greet1{
	String sayHello();
	default void defaultMethod() {
		System.out.println("Default method");
	}
}

class Demo implements Greet1{

	@Override
	public String sayHello() {
		
		return "Hello from sayHello method";
	}

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		System.out.println("Overriden default method");
	}
	
	
	
}

public class DefaultMethodExample {

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.sayHello());
		demo.defaultMethod();
	}

}
