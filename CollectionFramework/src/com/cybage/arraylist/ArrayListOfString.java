package com.cybage.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ArrayListOfString {

	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		namesList.add("Pankaj");
		namesList.add("Mohit");
		namesList.add("Onkar");
		namesList.add("Soham");
		namesList.add("Shivaji");
		namesList.add("Rohit");
		namesList.add(2,"Sunil");
		
		
		
		System.out.println("names containes Sunil : "+namesList.contains("Sunil"));		
	
		System.out.println("index of Soham  : "+namesList.indexOf("Soham"));
		System.out.println("get element at 4th index : "+namesList.get(4));
		
		
		
		System.out.print("List of names : ");
		for(String name : namesList) {
			System.out.print(" "+name);
		}
		System.out.println();
		
		System.out.println("Remove ele Sunil : "+namesList.remove("Sunil"));	
	
		
		Iterator<String> iterator = namesList.iterator();
		System.out.print("List of names : ");
		while(iterator.hasNext()) {
			System.out.print(" "+iterator.next());
		}
		System.out.println();
		
		System.out.println("clear name list  ");
		namesList.clear();		
		
		
		//for each loop
		System.out.print("List of names : ");
		namesList.forEach(n->System.out.print(" "+n));
		System.out.println();
	}

}
