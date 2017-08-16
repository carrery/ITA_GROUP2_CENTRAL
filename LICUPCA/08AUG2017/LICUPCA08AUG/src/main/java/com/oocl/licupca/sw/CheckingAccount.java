package com.oocl.licupca.sw;

public class CheckingAccount {
	private double balance;
	private int number;
	
	public CheckingAccount(int number, double balance) {
		this.number = number;
		this.balance = balance;
		System.out.println("Account " + this.number + " created with a initial balance of $"+ this.balance);
	}
	public void deposit (double amount) {
		this.balance += amount;
		System.out.println("Depositting $" + amount +"...");
		System.out.println("Transaction completed. Depositted an amount of $"+ amount + ".Balance is now $" + this.balance + " for account number "+ this.number);
	}
	public void withdraw(double amount) throws InsufficientFundsException {
		System.out.println("Withdrawing $" + amount +"...");
		if (amount <= balance) {
			this.balance -= amount;
			System.out.println("Transaction completed. Withdrew an amount of $"+ amount + ". Balance is now $" + this.balance + " for account number "+ this.number);
		}
		else
			throw new InsufficientFundsException(amount);
	}
	public double getBalance() {
		return this.balance;
	}
	
	public double getNumber() {
		return this.number;
	}
}
