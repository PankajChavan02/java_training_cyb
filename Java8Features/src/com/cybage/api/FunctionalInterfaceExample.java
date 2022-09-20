package com.cybage.api;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		Function<Integer, Integer> function = (a)->a*a;
		System.out.println(function.apply(24));
		
		BiFunction<Integer, Integer, String> biFunction = (a,b)->"Sum of number is : "+(a+b);
		System.out.println(biFunction.apply(13, 17));
		}

}
