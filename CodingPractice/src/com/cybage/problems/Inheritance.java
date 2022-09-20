package com.cybage.problems;


class Base{
	int numbers = 10;
	
	void print() {
		System.out.println("Hello from base class");
	}
}

class Subclass extends Base{
	int numbers = 20;
	
	void print() {
		System.out.println("Hello from sub class");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Subclass sub = new Subclass();
		sub.print();
		
		Base base = new Subclass();
		System.out.println(base.numbers);
		base.print();

	}

}
