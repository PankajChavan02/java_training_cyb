package com.cybage.api;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
//		accepts an objects and returns boolean
		Predicate<Integer> predicate=(a)->a%2==0;
		System.out.println(predicate.test(25));
		
		
		BiPredicate<String, String> biPredicate=(a,b)->a.equals(b);
		System.out.println(biPredicate.test("Hi", "Hi"));
	}

}
