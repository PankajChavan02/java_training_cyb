package com.cybage.fundamentalsofjava1;

import java.util.Scanner;



/*Write a Java method to display the middle character of a string. 
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
*/

public class MiddleCharacterProblem {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter string : ");
		String givenString = scanner.nextLine();
		
		//condition to check if string is present or not
		if(givenString.length()>=1) {
		
		int i=0,j=givenString.length()-1;		
		
		//find middle index
		while(i!=j && i+1!=j ) {
			//System.out.println(i+" "+j);
			i++;j--;
		}
		
		if(i==j) System.out.println("Middle character is : "+givenString.charAt(i));
		else System.out.println("Middle characters are : "+givenString.charAt(i)+" and "+givenString.charAt(j));
		
		}

	}

}
