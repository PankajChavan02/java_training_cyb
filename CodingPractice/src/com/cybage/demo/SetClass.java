package com.cybage.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	
	
	
	public static void main(String[] args) {
		
		//Set<Integer> set = new HashSet<>();
		//oder is not maintained in which elements are inserted
		
		//Set<Integer> set = new LinkedHashSet<>(); 
		//oder is maintained in which elements are inserted
		
		
		Set<Integer> set = new TreeSet<>(); 
		//for sorted in ascending order and unique elements
		//null is not allowed
				
		
		set.add(15);
		set.add(15);		
		set.add(15);		
		set.add(10);		
		set.add(18);
		//set.add(null);
		
		List<Integer> list = new ArrayList<>();
		list.addAll(set);
		
		
		Iterator<Integer> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		Collections.sort(list,(a,b)->b-a);
		System.out.println(list);
		
		set.addAll(list);
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
		
	}

}







