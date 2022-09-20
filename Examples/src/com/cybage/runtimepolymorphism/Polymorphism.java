package com.cybage.runtimepolymorphism;

class BaseClass{
	
}

class SubClass extends BaseClass{
	public SubClass() {
		 super();
	}
	public void display() {
		System.out.println("inside subclass !!!!");
	}
}

public class Polymorphism {	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass b = new SubClass();
		b.display();

	}

}
