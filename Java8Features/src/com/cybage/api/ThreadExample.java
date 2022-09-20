package com.cybage.api;

public class ThreadExample {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Thread thread = new Thread(()->System.out.println("Inside runnable implementation"));
		thread.start();
		System.out.println(thread.getPriority());
		thread.interrupt();
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(thread.isAlive());
	}

}
