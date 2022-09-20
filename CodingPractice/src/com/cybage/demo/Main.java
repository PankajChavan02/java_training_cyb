package com.cybage.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Main {
	
	static int[] filter(int[] arr) {
		int i=0,j=0;
		int[]res = new int[arr.length];
		
		while(i<arr.length-1) {		
			
			if(arr[i]==arr[i+1]) {				
				int temp = arr[i];
				while(true && i!=arr.length - 1) {
					if(arr[i]!=temp) break;
					i++;
				}
			}else {
				res[j++]=arr[i];
				i++;
			}
		}
		return res;
	}
	
	static String reverse(String message) {
		String [] str = message.split(" ");
		
		StringBuilder builder = new StringBuilder();
		
		
		
		for(int i=0;i<str.length;i++) {
			
			char [] charArray = str[i].toCharArray();
			
			int first=0,last=charArray.length-1;
			
			//logic for reversing
			while(first<=last) {
				char temp = charArray[first];
				charArray[first++]=charArray[last];
				charArray[last--]=temp;
			}
			
			
			for(char ch:charArray) {
				builder.append(ch);
			}	
			
			builder.append(" ");
		}
		
		return builder.toString();
		
		
	}

	public static void main(String[] args) {
		int arr[]= {11,11,12,13,14,13,15,15,15,13,13,8,7};
		String message = "Hello world !!!";
		System.out.println(reverse(message));
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(filter(arr)));
		
		
		System.out.println(Arrays.toString(arr));
	}

}



















