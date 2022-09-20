package com.cybage.api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExmaple {
	
	public static void main(String[] args) {
		
//		Takes input parameter but returns nothing
		Consumer<String> consumer = (s)->System.out.println(s);;
	   consumer.accept("Hello from consumer interface");
	   
	   BiConsumer<String, String> biConsumer = (a,b)->System.out.println( a+" "+b);
	   biConsumer.accept("Hello from", "Biconsumer");
	
	}

}
