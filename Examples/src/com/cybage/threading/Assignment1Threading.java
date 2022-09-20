package com.cybage.threading;


import java.time.LocalDateTime;

public class Assignment1Threading {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		t1.setName("MyThread");
		System.out.println("Current thread name : "+t1.getName()+" "+LocalDateTime.now());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Current thread name : "+t1.getName()+" "+LocalDateTime.now());
		
		
		
		

	}

}
