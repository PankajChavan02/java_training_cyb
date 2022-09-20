package com.cybage.interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {
	
	public static Map<Integer, Integer> getNotes(int amount){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int notes;
		if(amount>500) {
			if(amount%500==0) {
				notes=amount/500-1;
			}else notes = amount/500;
			amount=amount-notes*500;
			map.put(500, notes);			
		}
		if(amount>200) {
			if(amount%200==0) {
				notes=amount/200-1;
			}else notes = amount/200;
			amount=amount-notes*200;
			map.put(200, notes);			
		}
		notes = amount/100;
		map.put(100, notes);
		return map;
	}
	
	public static void main(String[] args) {
		String[] str = {"abhi","ameya","mohitraj","pankaj"};
		List<String> strList = Arrays.asList(str);
		strList = strList.stream().map(p-> p=p.length()+"").collect(Collectors.toList());
		System.out.println(strList);
		
		Map<Integer, Integer> map = getNotes(1400);
		System.out.println(map);
		
	}

}
