package com.cybage.assignments;

public class Account {
	
	static Double balance = 0.0;
	
	public Account() {
		
	}

	public Account(Double balance) {
		super();
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amt) {
		balance = balance + amt;
	}
	
	public void withdraw(Double amt) {
		balance = balance -amt;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	

}
