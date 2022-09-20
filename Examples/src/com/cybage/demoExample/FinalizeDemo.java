package com.cybage.demoExample;

public class FinalizeDemo {
	
	public static void main(String[] args) {
		FinalizeDemo obj = new FinalizeDemo();
		
		obj = null;
		
		System.gc();
		System.out.println("Garbage Colloector");
		
		
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() method called");
	}

}
