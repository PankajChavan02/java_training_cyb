package com.cybage.interview;


class DemoClass{
	//static field
	public static DemoClass demoInstance;
	
	//pirvate constructor
	private DemoClass() {
		System.out.println("First instance");
	}
	
	//static method
	public static DemoClass getInstance() {
		if(demoInstance==null)
			demoInstance = new DemoClass();
		return demoInstance;
	}
	
}


public class SingletonClass {

	public static void main(String[] args) {
		DemoClass d1 = DemoClass.getInstance();
		DemoClass d2 = DemoClass.getInstance();
		System.out.println(" comparison " + (d1==d2));

	}

}
