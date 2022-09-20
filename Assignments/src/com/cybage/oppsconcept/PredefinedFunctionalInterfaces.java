package com.cybage.oppsconcept;

import java.util.function.*;
/**
 * Write a program to understand predefined functional interfaces. Implement using anonymous classes 
 * class which contains different types of functional interfaces
*/

public class PredefinedFunctionalInterfaces {

	public static void main(String[] args) {
		/** 
		 * functional interface supplier
		 * @param void
		 * @return string
		*/
		Supplier<String> supplierInstance = ()-> "Supplier functional interface has abstract method get which returns resource";
		System.out.println("calling Supplier get method : "+supplierInstance.get());
		
		/** 
		 * functional interface consumer
		 * @param Integer and Integer
		 * @return void
		*/
		BiConsumer<Integer, Integer> consumerInstance = (number1,number2)->System.out.println(number1+" + "+number2+" = "+(number1 + number2));
		consumerInstance.accept(15, 25);
		
		/** 
		 * functional interface BiPredicate
		 * @param Integer and Integer
		 * @return Boolean
		*/
		BiPredicate<Integer, Integer> ascending = (number1,number2)->{
			if (number1>number2){
				return true;
			}else
				return false;
		};
		System.out.println("negative of 15 is greater than 25 "+ascending.negate().test(15, 25));
		
		
		/** 
		 * functional interface Function
		 * @param Integer
		 * @return String
		*/
		Function<Integer, String> functionInstance = (number)-> "Function interface apply method provide with int parameter : "+number+" and return type is string ";
		System.out.println(functionInstance.apply(45));

	}

}
