package com.oocl.licupca.sw;

public class InsufficientFundsException extends Throwable{
	double amount;
	public InsufficientFundsException(double amount) {
		this.amount = amount;
		System.err.println("Insufficient funds. Cannot withdraw $"+amount);
	}
	
	public double getAmount() {
		return this.amount;
	}

}
