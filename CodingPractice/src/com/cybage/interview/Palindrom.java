package com.cybage.interview;

public class Palindrom {
	
	
	public static boolean isNumberPalindrom(int num) {
		int temp = num;
		int rev=0;
		
		
		while(temp%10!=0) {
			rev =10*rev + temp%10;
			temp=temp/10;
		}
		
		return rev==num?true:false;
	}
	
	public static boolean isStringPalindrom(String str) {
		char[] arr = str.toCharArray();
		int first = 0;
		int last = arr.length-1;
		// 12321
		while(first<=last) {
			if(arr[first++]!=arr[last--])
				return false;
		}		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "abccbad";
		System.out.println(isStringPalindrom(str));
		System.out.println(isNumberPalindrom(123201));
	}

}
