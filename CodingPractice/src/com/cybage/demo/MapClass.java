package com.cybage.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {

	public static void main(String[] args) {
      Map<Integer, String> map = new HashMap<>();
		//Map<Integer, String> map =new LinkedHashMap<>();
		//Map<Integer, String> map =new TreeMap<>();
		//Hashtable<Integer, String> map =new Hashtable<>();
      
      map.put(2, "Sunita");
      map.put(4, "Varun");
      map.put(5,"Krishnat");
      map.put(1,"Pankaj");
      
      
//      map.entrySet().forEach(p->{
//    	  if(p.getValue().equals("Pankaj"))
//    	     System.out.println(p.getKey()+"   "+p.getValue());
//      });
      
      System.out.println(map);
      
      

	}

}
