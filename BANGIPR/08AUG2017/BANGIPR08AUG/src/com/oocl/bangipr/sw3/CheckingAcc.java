package com.oocl.bangipr.sw3;

public class CheckingAcc {

	private double amt;
	private double amtDraw;
	
	public double bal = 1000;
	
	public double Deposit (double amt) {
		
		return bal+=amt;
	}
	
	public double Withdraw(double amtDraw) {
	
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
	
	public double Balance() {
		return bal;
	}
}
