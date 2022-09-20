package com.cybage.problems;

public class Change {

	int data = 100;
	
	void changeT(int data) {
		data = 100 + data;
	}
	
	public static void main(String[] args) {
		Change change = new Change();
		System.out.println(change.data);
		change.changeT(500);
		System.out.println(change.data);
	}
}
