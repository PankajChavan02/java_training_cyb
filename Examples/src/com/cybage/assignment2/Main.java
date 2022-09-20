package com.cybage.assignment2;
import java.util.function.*;

public class Main {

	public static void main(String[] args) {		
		
		Supplier<Employee> instance = () ->  new Employee();
		System.out.println(instance.get());		
	}

}
