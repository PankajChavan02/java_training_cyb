package com.cybage.assignment4;

class PrintTables {
	public int number;
	
	public PrintTables(int number) {
		this.number = number;
	}
	
	//synchronized public void display() {
	public void display() {
		System.out.print("Table of "+number+" is : ");
		for(int i=1;i<=10;i++) {
			System.out.print(number*i+" ");
		}
		System.out.println();
	}
}


class MyThread extends Thread {	
	PrintTables printTable;
	
	public MyThread( PrintTables printTable) {
		super();
		this.printTable = printTable;
	}
	
	@Override
	public void run() {
		synchronized(printTable) {
			printTable.display();	
		}
		
	}
	
}

public class SynchronizedConcept {

	public static void main(String[] args) {
		
		PrintTables printTables = new PrintTables(25);
		MyThread thread1 = new MyThread(printTables);
		MyThread thread2 = new MyThread(printTables);
		MyThread thread3 = new MyThread(printTables);
		
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
