package com.oocl.bangipr.sw3;

public class AmountExcept extends Throwable{

	private double amount;
	public AmountExcept(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
}
