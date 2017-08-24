package com.oocl.bangipr.sw1;

public class CheckingAcc {

	private double amt;
	private double amtDraw;
	private String value;
	
	public double bal = 1000;
	
	public double Deposit (String value, double amt) {
		
		return bal+=amt;
	}
	
	public double Withdraw(String value, double amtDraw) {
	
		double balance = bal;
		//AmountExcept except = new AmountExcept(amtDraw);
		
		if(bal > amtDraw) {
			balance = (bal - amtDraw);
		} else {
			try {
				throw new AmountExcept(amt);
			} catch (AmountExcept e) {
				e.printStackTrace();
				double need = amtDraw - balance;
				System.out.println("Sorry but you do not have enough balance. You need " + need + " to withdraw");
			}
		}
		
		
		return bal = balance;
	}
	
	public double Balance(String value) {
		if(value.equals("Balance")) {
			return bal;
		}
		return 0;
	}
}
