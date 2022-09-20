package com.cybage.assignments;

import java.util.Arrays;

public class Assignment1MinMax {

	public static void main(String[] args) {
		
		
		//new array 
		int [] newArray = new int[10];
		newArray[0]=37;
		newArray[1]=45;
		newArray[2]=47;
		newArray[3]=86;
		newArray[4]=67;
		newArray[5]=91;
		newArray[6]=28;
		newArray[7]=16;
		newArray[8]=48;
		newArray[9]=90;
		Arrays.sort(newArray);
		System.out.println("Sorted array : "+Arrays.toString(newArray));
		System.out.println();

		
		System.out.print("Small numbers :");
		
		for(int i=0;i<3;i++) {
			System.out.print(newArray[i] +"-");
			
		}
		System.out.println();
		
          System.out.print("Larger numbers :");
		
		for(int i=newArray.length-3;i<newArray.length;i++) {
			System.out.print(newArray[i]+"-");
			
		}
		System.out.println();
		
				
	}

}
