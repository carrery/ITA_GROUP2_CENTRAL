package com.oocl.burgoka.sw3;

public class CheckAccount extends BankTest1 {
	private double amnt;
	private ExceptionFound excep;
	
	public CheckAccount() {
	}
	
	public double getDeposit(double dep) {
		return amnt +=  dep;
	}
	
	public double getWithdraw(double with) {
		if(amnt < with) {
			try {
				throw new ExceptionFound("Insufficient amount to withdraw");
			} catch (ExceptionFound e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			amnt -= with;
		}
		return amnt;
	}
	
	public double serviceFee(double fee, double with) {
		return amnt = (amnt - with + (-fee));
	}
	
	public double totalAmount() {
		return amnt;
	}
	
	

}
