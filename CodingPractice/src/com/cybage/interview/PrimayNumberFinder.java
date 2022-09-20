package com.cybage.interview;

public class PrimayNumberFinder {
	
	public static boolean primaryNumbChecker(int num) {
		for(int j=2;j<=num/2;j++) {
			if(num%j==0) return false;
		}		
		return true;
	}
	
	public static void primeNumberGetter(int num) {
		System.out.print(" 2 -> ");
		int count = 1;
		for(int i=3;i<=num;i++) {
			if(primaryNumbChecker(i)) {
				System.out.print(i+" ->");
				count++;
			}
		}
		System.out.println("\n"+count);
	}
	
	public static int reverseInteger(int num) {
		int reverse = 0;
		while(num!=0) {
			reverse = 10*reverse +num%10;
			num=num/10;
		}
		return reverse;
	}
	
	

	public static void main(String[] args) {
		//primeNumberGetter(200);
		System.out.println(reverseInteger(1234567));
	}

}
