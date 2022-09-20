package com.cybage.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		Integer [] arr = {25,27,200,10,65,56,98};
		Arrays.asList(arr).stream().map(x->x*x).forEach(x->System.out.print(x+" "));
		
		
//		Stream.of(25,27,200,10,65,56,98).map(x->x*1).forEach(System.out::println);	
		
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
//		Arrays.asList(arr).stream().filter(x->x%2==0).forEach(System.out::println);

		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "abc", 10));
		customers.add(new Customer(3, "abc1", 11));
		customers.add(new Customer(5, "abc2", 12));
		customers.add(new Customer(7, "abc3", 13));
		customers.add(new Customer(11, "abc4", 14));
		customers.add(new Customer(13, "abc5", 15));
		customers.add(new Customer(19, "abc6", 16));
		
		customers.stream().filter(x->x.getId()>5).forEach(System.out::println);
		
//		Convert stream to collection
		System.out.println("======================== filter by even age =============================");
		List<Customer> filteredList = customers.stream().filter(x->x.getAge()%2==0).collect(Collectors.toList());
		filteredList.forEach(System.out::println);
		
		System.out.println("======================== sorted function =============================");
//		customers.stream().sorted((x,y)->y.getAge()-x.getAge()).forEach(System.out::print);
		customers.stream().sorted(Comparator.comparingInt(Customer::getAge)).forEach(System.out::print);
		
		System.out.println("========================== filer by name ==================================");
		customers.stream().filter(x->x.getName().contains("c")).forEach(System.out::println);
		
		System.out.println("========================== reduce method ==================================");
		int result = Arrays.asList(arr).stream().reduce(0, (a,b)->a+b);
		System.out.println(Arrays.toString(arr)+"\n Sum of array elements is : "+result);
		
		System.out.println("========================== average age calculation using reduce method ==================================");
		double age = customers.stream().collect(Collectors.averagingInt(Customer::getAge));
		System.out.println(age);
		
		System.out.println("============================ collect summarizeInt method =============================================");
		IntSummaryStatistics summary = Arrays.asList(arr).stream().collect(Collectors.summarizingInt(x->x));
		System.out.println(summary);
		
//		partician by
//		sumingInt
//		minBy
//		maxBy
		
	}

}
