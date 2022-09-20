package com.cybage.threading;

public class Assignment3 {
	public static int number = 2;

	public static void main(String[] args) {
		
		//int number = 2;
		
		Thread thread1 = new Thread(()->
		{
			for(int k=0;k<5;k++) {
				number +=1 ;
				//System.out.println("value of i : "+number);
				//sleep for 4 seconds
				try {					
					Thread.sleep(800);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				}
				
			}
		}
		,"MyThread1") ;
		Thread thread2 = new Thread(()->
				{
					for(int k=0;k<5;k++) {
						
						//to store factorial of each number
						int factorial = 1;
						
						// getting factorial of i 
						for(int j=1;j<=number;j++) {
							factorial = factorial *j;
						}			
						
						//sleep for 5 seconds
						try {
							System.out.println(number+" : "+factorial);
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				},"MyThread2");
		
		
		thread1.start();
		
		thread2.start();

	}
	

}
