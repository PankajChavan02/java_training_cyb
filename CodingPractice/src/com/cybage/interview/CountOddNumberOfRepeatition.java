package com.cybage.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOddNumberOfRepeatition {
	
	public static List<Integer> getOddTimeRepeatedElements(int[] arr){
		
		List<Integer> list = new ArrayList<>();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int temp = arr[0];
		int count = 1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==temp) {
				count++;
			}else {
				if(count%2!=0) {
					list.add(temp);
				}
				temp=arr[i];
				count=1;
			}
		}
		
		if(count%2!=0)
			list.add(temp);
		
		return list;
	} 

	public static void main(String[] args) {
		int []arr = {1,1,2,5,7,2,5,4,7,2,1,3,2,5};
		System.out.println(getOddTimeRepeatedElements(arr));
	}

}
