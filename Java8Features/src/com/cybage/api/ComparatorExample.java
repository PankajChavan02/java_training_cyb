package com.cybage.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "abc", 10));
		customers.add(new Customer(3, "abc1", 11));
		customers.add(new Customer(5, "abc2", 12));
		customers.add(new Customer(7, "abc3", 13));
		customers.add(new Customer(11, "abc4", 14));
		customers.add(new Customer(13, "abc5", 15));
		customers.add(new Customer(19, "abc6", 16));
		
		Collections.sort(customers,(a,b)->b.getAge()-a.getAge());
		System.out.println(customers);
		
		Collections.sort(customers,(a,b)->b.getId()-a.getId());
		System.out.println(customers);
		
		Collections.sort(customers,(a,b)->b.getName().compareTo(a.getName()));
//		System.out.println(customers);
		
		customers.forEach((x)->System.out.print(x));
	}

}
