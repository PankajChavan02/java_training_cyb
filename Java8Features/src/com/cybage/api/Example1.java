package com.cybage.api;

// annotation prevents from adding other abstract methods
@FunctionalInterface
interface Greet{
	void sayHello();
}

@FunctionalInterface
interface Math{
	int sum(int a,int b);
}

public class Example1 {

	public static void main(String[] args) {
//		using anonymous class
		Greet greet1 = new Greet() {
			@Override
			public void sayHello() {
				System.out.println("Hello from anonymous class");
			}
		};
		greet1.sayHello();
		
//		Using lambda expression
		Greet greet2=()->System.out.println("Hello from Lambda");
		greet2.sayHello();
		
		Math math =(a,b)->{return a+b;};
		System.out.println(math.sum(13, 17));
		
		
		
		
		

	}

}
