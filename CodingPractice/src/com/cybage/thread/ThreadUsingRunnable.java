package com.cybage.thread;


class Thread1 implements Runnable {
	
	public Thread1() {
         Thread thread = new Thread(this);
         thread.setPriority(1);
         thread.start();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 running ");
	}
	
}

class Thread2 extends Thread{
	public Thread2() {
		// new Thread(Runnable run);
		// new Thread(()->xyz);
		
		super(()->{
			try {
				Thread.sleep(2000);
				System.out.println("Thread 2 running");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		System.out.println(this.isDaemon());
		this.setPriority(10);
       this.start();
	}
}

public class ThreadUsingRunnable {

	public static void main(String[] args) {
//		Thread1 th1 = new Thread1();
//		Thread2 th2 =  new Thread2();
//		
		String str = "Hello world";
//		String str1 = "Hello world";
//		System.out.println(str1.hashCode());
//		System.out.println(str.hashCode());
		//str = str + "Hi";
//		System.out.println(str.hashCode());
		
		
		System.out.println(str.hashCode());
		System.out.println(replace(str));

	}
	
	public static String replace(String str) {
//		System.out.println("result  => ");
//		StringBuilder result = new StringBuilder();
//		System.out.println(result.hashCode());
//		for(int i=str.length()-1;i>=0;i--) {
//			result.append(str.charAt(i));
//			System.out.println(result.hashCode());
//		}
//		System.out.println(result);
		System.out.println(str.hashCode());
		str = str + " hi Abhishek";
		//return result.toString();
		return str;
	}

}
