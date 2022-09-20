package com.cybage.assignment4;


class PrintFactorial{
	int number ; 
	boolean flag = false;
	
	public int getFactorial() {
		if(!flag) {
			try {
				//System.out.println("waiting for setter ... ");
				wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			
		}
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial = factorial *i;
		}
		flag = false;
		notify();
		return factorial;
	}
	
	public void setFactorial(int number) {
		if(flag) {
			
			try {
				
				//System.out.println("waiting for getter ...");				
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		this.number = number;
		flag = true;
		notify();
	}
}


class SetNumber extends Thread{
	int number=2;
	PrintFactorial printFactorial;
	
	public SetNumber(PrintFactorial printFactorial) {
		super();
		
		this.printFactorial = printFactorial;
	}


	@Override
	public void run() {
		int i=0;
		while(i++!=10) {
		
		synchronized(printFactorial) {
			
			printFactorial.setFactorial(number);
			System.out.print(number+" : ");
			number++;
			
		} 
		}
	}
}

class GetNumber extends Thread{
	
	PrintFactorial printFactorial;	
	
	public GetNumber(PrintFactorial printFactorial) {
		super();
		this.printFactorial = printFactorial;
	}


	@Override
	public void run() {
		int i=0;
		while(i++!=10) {
			synchronized(printFactorial) {
				System.out.print(" "+printFactorial.getFactorial());
				System.out.println();
			}
		}
	}
}


public class InterthreadCommunication {

	public static void main(String[] args) {
		PrintFactorial printFactorial = new PrintFactorial();
		SetNumber setFactorial = new SetNumber(printFactorial);
		GetNumber getFactorial = new GetNumber(printFactorial);
		setFactorial.start();
		getFactorial.start();
		

	}

}
