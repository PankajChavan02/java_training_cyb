package com.cybage.inheritance;

public class Main {

	public static void main(String[] args) {
		
		SavingAccount savingAcc = new SavingAccount(10000.00, 4.0);
		System.out.println("Initial balance : "+savingAcc.getBalance());
		System.out.println("Depositing amount of : 4000");
		savingAcc.deposite(4000.00);
		System.out.println("current balance : "+savingAcc.getBalance());
		System.out.println("Withdrawing amount of : 2000 ");
		savingAcc.withdrawl(2000.00);
		System.out.println("current balance : "+savingAcc.getBalance());
		
		
		CheckingAccount checkAcc = new CheckingAccount(50000.00);
		System.out.println("Depositing amount of : 4000");
		checkAcc.deposite(4000.00);
		System.out.println("current balance : "+checkAcc.getBalance());
		System.out.println("Withdrawing amount of : 2000 ");
		checkAcc.withdrawl(2000.00);
		System.out.println("current balance : "+checkAcc.getBalance());
		
		
	}

}
