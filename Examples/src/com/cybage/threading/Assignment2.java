package com.cybage.threading;

import java.time.LocalDateTime;

public class Assignment2 {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(()-> {
			
			
			for(int i=0;i<20;i++) {
			System.out.println(LocalDateTime.now());
			try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    }
			
		},"MyThread");
		thread1.start();
			
		
		
		

	}

}
