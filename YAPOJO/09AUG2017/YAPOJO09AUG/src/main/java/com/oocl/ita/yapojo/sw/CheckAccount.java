package com.oocl.ita.yapojo.sw;

public class CheckAccount {
	private double balance;
	
	public CheckAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public double deposit(double cash) {
		balance += cash;
		System.out.println("Deposit: " + cash);
		System.out.println("Current Balance: " + balance);
		return balance;
		
	}
	
	public double withdraw(double cash) throws InsufficientFundsException {
		if(balance < cash) {
			System.out.println("Withdraw: " + cash);
			throw new InsufficientFundsException(cash);
		} else {
			balance-=cash;
			System.out.println("Withdraw: " + cash);
			System.out.println("Current Balance: " + balance);
			return balance;
		}
	}
	
	public double checkBalance() {
		System.out.println("Balance: " + balance);
		return balance;
	}

}
