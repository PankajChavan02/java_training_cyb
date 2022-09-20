package com.cybage.problem;


interface I1 {
	default void show() {
		System.out.println("I1 interface");
	}
}

interface I2 {
	default void show() {
		System.out.println("I2 interface");
	}
}

public class DiamontProblem implements I1,I2 {
	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		I2.super.show();
		I1.super.show();
		
	}
	

	public static void main(String[] args) {
		DiamontProblem inst = new DiamontProblem();
		inst.show();
		

	}


}
