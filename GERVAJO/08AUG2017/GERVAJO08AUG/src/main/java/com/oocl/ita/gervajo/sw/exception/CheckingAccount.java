package com.oocl.ita.gervajo.sw.exception;

public class CheckingAccount {
	private double balance;
	private int number;
	
	public CheckingAccount(int number) {
		this.number = number;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
		balance += amount;
		System.out.println("Depositing amount: " + amount);
		} else {
			System.err.println("Invalid amount!");
		}
	}
	
	public void withdraw(double amount) throws InsufficientFundException {
		if(balance < amount) {
			throw new InsufficientFundException(amount);
		} else {
			balance -= amount;
			System.out.println("Withdrawing amount: " + amount);
		}
	}
	
	public void checkBalance() {
		System.out.println("Current balance is " + balance + " for account number " + number);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
