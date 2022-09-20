package com.cybage.interview;

import java.util.Arrays;

public class ArrayUnique {

	static void sort(int []arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
	}
	
	static void nonRepeatedElement(int []arr) {
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			
			if(i<arr.length-1 && arr[i]==arr[i+1]) {
				temp=arr[i];
				while(arr[i+1]==temp) i++;
			}
			
			else System.out.print(arr[i]+"   ");
				
		}
		
	}
	
	static void unique(int []arr) {
		int index = 1;
		sort(arr);
		System.out.println();
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]!=arr[i]) {
				arr[index++]=arr[i];
			}			
		}
		
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]+"->");
		}
		
		
	}
	
	public static void main(String[] args) {
		int []arr = {2,4,5,6,12,5,4,2,6,6};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		nonRepeatedElement(arr);
		unique(arr);
		
	}

}
