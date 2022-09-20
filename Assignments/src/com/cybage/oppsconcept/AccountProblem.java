package com.cybage.oppsconcept;

/*Create a class:  Bank Account 
Create subclasses:      1. Saving  &  2.Current 
Rate of interest is different for different types of account.
*/

//account class
class Account {
	private String accountNumber;
	private double balance;	
		
	public Account(String accountNumber, double balance) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double calculateBalanceAfterOneYear() {
		return this.balance;
	}
}

class CurrentAccount extends Account{
	private double interest;

	public CurrentAccount(String accountNumber, double balance, double interest) {
		super(accountNumber, balance);
		this.interest = interest;
	}
	
	@Override
	public double calculateBalanceAfterOneYear() {
		return super.calculateBalanceAfterOneYear() + super.calculateBalanceAfterOneYear()*interest/100;
	}

	
}

class SavingAccount extends Account{
	private double interest;

	public SavingAccount(String accountNumber, double balance, double interest) {
		super(accountNumber, balance);
		this.interest = interest;
	}	
	
	@Override
	public double calculateBalanceAfterOneYear() {
		return super.calculateBalanceAfterOneYear() + super.calculateBalanceAfterOneYear()*interest/100;
	}
	
}


public class AccountProblem {

	public static void main(String[] args) {
		
		SavingAccount savingAccount = new SavingAccount("12457896312",50000.00, 4.5);
		System.out.println("Calculate balance of saving acc after one year : "+savingAccount.calculateBalanceAfterOneYear());
		
		CurrentAccount currentAccount = new CurrentAccount("12457896312",50000.00, 3.0);
		System.out.println("Calculate balance of saving acc after one year : "+currentAccount.calculateBalanceAfterOneYear());

	}

}
