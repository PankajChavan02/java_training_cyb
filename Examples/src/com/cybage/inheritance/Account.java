package com.cybage.inheritance;

class Account {
	double balance;
	
	public Account(double initBalance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double balance) {
		this.balance = this.balance + balance;
	}
	
	public void withdrawl(double balance) {
		this.balance = this.balance - balance;
	}

}


class SavingAccount extends Account{
	double interestRate;
	
	public SavingAccount(double initBalance,double interestRate) {
		super(initBalance);
		this.interestRate = interestRate;
	}	
	
}


class CheckingAccount extends Account {
	double overdraftAmount;
	
	public CheckingAccount(double initBalance,double overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = overdraftAmount;		
	}
	
	public CheckingAccount(double initBalance) {
		super(initBalance);
	}

	
	@Override
	public void withdrawl(double balance) {
		super.withdrawl(balance);
	}
	
}

