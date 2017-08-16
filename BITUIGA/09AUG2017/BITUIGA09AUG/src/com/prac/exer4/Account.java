package com.prac.exer4;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	public String accNumber;
	private double remBalance = 5000;
	public List<String> logs = new ArrayList<String>();
	private double svcCharge = 15;
	
	public String accName;
	public String passCode;
	
	public Account(String user,String pass) {
		this.accName = user;
		this.passCode = pass;
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
	
	public String checkCredentials(String inputUser, String inputPass) {
//		System.out.println(inputUser + " " + inputUser);
//		System.out.println(this.accName + " " + this.passCode);
		if((inputUser).toLowerCase().equals(this.accName.toLowerCase()) && inputPass.equals(this.passCode)) {
			return "Success";
		}
		else return "Failed";
	}

}
