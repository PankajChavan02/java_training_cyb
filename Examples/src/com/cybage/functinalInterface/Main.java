package com.cybage.functinalInterface;


interface FunctionalInterface{
	
	default void display(){
		System.out.println("This is default method of functional interface");
	}
	
	public void sum(int a,int b);
	
}

public class Main {

	public static void main(String[] args) {
		
		FunctionalInterface demo = (int a, int b) ->  System.out.println(a+b);;
		demo.sum(10, 12);
demo.display();
		
	}

}
