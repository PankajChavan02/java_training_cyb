package com.cybage.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfTwoIsGivenNumber {
	
	public static Map<Integer, Integer> findRequiredPair(int []arr, int target){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target)
					map.put(arr[i], arr[j]);					
			}
		}
		return map;
	}

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6,7,11,15};
		int target = 9;
		System.out.println(findRequiredPair(arr, target));

	}

}
