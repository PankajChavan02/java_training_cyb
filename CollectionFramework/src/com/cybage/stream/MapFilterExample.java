package com.cybage.stream;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFilterExample {

	public static void main(String[] args) {
		//Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map = new Hashtable<Integer, String>();
		//Map<Integer,String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "Dog");
		map.put(5, "Cat");
		map.put(4, "Horse");
		map.put(7, "Cow");
		map.put(3, "Bull");
		map.put(null, null);
		map.put(null, null);
		
		map.keySet(); //keys :  set
		map.values(); //values : collection
		
		System.out.println("Old map : ");
		map.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		
		Map<Integer, String> newMap =  map.entrySet().stream().
		filter(x->x.getKey()<5).
		collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
		
		System.out.println();
		System.out.println("New map with key <5 : ");
		newMap.entrySet().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
	}

}
