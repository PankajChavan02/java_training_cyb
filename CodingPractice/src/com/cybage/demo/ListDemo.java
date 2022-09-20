package com.cybage.demo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;




public class ListDemo {

	public static void main(String[] args) {
		//List<Integer> list = new ArrayList<>();		
		List<Integer> list = new LinkedList<>();
		//List<Integer> list = new Stack<>();
		list.add(2);
		list.add(10);
		list.add(25);
		list.add(45);
		list.add(22);
		list.add(10);
		System.out.println(" list containes(10) : "+list.contains(10));
		System.out.println("get(0)              : "+list.get(0));
		System.out.println("index of 10         : "+list.indexOf(10));
		System.out.println("last index of 10    : "+list.lastIndexOf(10));
		list.remove(2);
		System.out.println(list);
		

		//Collections.sort(list);		
		//System.out.println(list);
		
		//Collections.sort(list,new ListComparator());		
		//System.out.println(list);
		
		//list.clear();
		//System.out.println(list);
		
		LinkedList<Integer> newList = (LinkedList<Integer>) ((LinkedList<Integer>) list).clone();
		
		//System.out.println(newList==list);
		
		//list.forEach(x->x=x+5);
		//consumer only consumes value
		
//		Collections.sort(list,Collections.reverseOrder());
		
//		
//		list.sort((a,b)->b-a);
//		System.out.println(list.removeIf(p->p<20));
        System.out.println("reverse : ");
		
		
		ListIterator<Integer> iterator = newList.listIterator();		
		while(iterator.hasNext()) iterator.next();
		
		while(iterator.hasPrevious()) {
			System.out.print(iterator.previous()+" ");
		}
		
		System.out.println();
		double d= 7000006000.00;
		int val = (int)d;
		System.out.println(val);
		
		
		
		
		
		
		
		
		

	}

}
