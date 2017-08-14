package com.oocl.bituiga.sw4;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	public String accNumber;
	private double remBalance = 5000;
	public List<String> logs = new ArrayList<String>();
	private double svcCharge = 15;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public double getBalance() {
		return this.remBalance;
	}
	
	public void setBalance(double newBal) {
		this.remBalance = newBal;
	}
	
	public void withdrawMoney(double monOut) throws InsufficientFundsException {
		if(getBalance() > (monOut + svcCharge)) {
			setBalance(getBalance() - (monOut + svcCharge));
		}
		else throw new InsufficientFundsException();
	}
	
	public void depositMoney(double monIn) {
		this.remBalance+= (monIn-svcCharge);
	}
	
	public void logTransaction(String log) {
		this.logs.add(log);
	}

}
