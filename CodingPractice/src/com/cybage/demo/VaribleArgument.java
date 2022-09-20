package com.cybage.demo;

public class VaribleArgument {

	public static int add(int ... args) {
		int sum = 0;
		for(int element : args) {
			sum +=element;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10));
		System.out.println(add(10,20,30));
		System.out.println(add(10,20,30,40));
		System.out.println(add(10,20,30,40,50));
		System.out.println(add(10,20,30,40,50,60));

	}

}
