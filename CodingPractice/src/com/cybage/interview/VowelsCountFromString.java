package com.cybage.interview;


import java.util.HashMap;


public class VowelsCountFromString {
	public static void vowelsCount(String str) {
		str = str.toLowerCase();
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		String vowels = "aeiou";
		Integer count ;
		
		for(int i=0;i<arr.length;i++) {
			
			count = map.get(arr[i]);
			if(vowels.contains(arr[i]+"")) {
				if(count!=null ) {
					map.put(arr[i], ++count);
				}else {
					map.put(arr[i], 1);
				}
			}
		}
		
		map.entrySet().forEach(p->{
				System.out.println(p.getKey()+" -> "+p.getValue());			
		});
		
	}
	

	public static void main(String[] args) {	
		String str = "My name is Pankaj Krishnat CHAVAN";
		vowelsCount(str);
	}

}
