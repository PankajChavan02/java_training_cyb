package com.cybage.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingList {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(5, "Tarun", "job1"));
		list.add(new Employee(4, "Varun", "job2"));
		list.add(new Employee(6, "Soham", "job3"));
		list.add(new Employee(2, "Tejas", "job4"));
		list.add(new Employee(9, "Karan", "job5"));
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println();
		
		Collections.sort(list,(e1,e2)->e2.getId()-e1.getId());
		System.out.println(list);
		
		System.out.println(" emp contains : "+list.contains(new Employee(0, "Varun", "")));
		// equals and hashcode methods need to be overridden
		
	}

}
