package com.cybage.api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		
//		No input parameter only output object
		Supplier<String> supplier = ()->"Hello from supplier";
        System.out.println(supplier.get());
        
        
//		Takes input parameter but returns nothing
		Consumer<String> consumer = (s)->System.out.println(s);;
	   consumer.accept("Hello from consumer interface");
	
	   BiConsumer<String, String> biConsumer = (a,b)->System.out.println( a+" "+b);
	   biConsumer.accept("Hello from", "Biconsumer");
	
	}

}
