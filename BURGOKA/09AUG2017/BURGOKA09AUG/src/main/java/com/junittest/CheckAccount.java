package com.junittest;

import java.util.ArrayList;

public class CheckAccount extends BankTest {
	private double amnt;
	private ExceptionFound excep;
	ArrayList<String> passWord = new ArrayList<String>();
	
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
	
	
	public String getPassword(String pass) {
		passWord.add("admin");
		passWord.add("password");
		
		StringBuffer text = new StringBuffer();
		for (String pass1 : passWord) {
			if (pass1 == pass) {
				text.append(pass1);
			}
		}
		return text.toString();
	}
	
	public void setPassword(String newpass) {
		passWord.add("admin");
		passWord.add("password");
		StringBuffer text = new StringBuffer();
		for (String pass : passWord) {
			if (pass != newpass) {
				text.append(newpass);
				passWord.add(newpass);
			}
			else {
				System.out.println("Password Taken!");
			}
		}	
	}

}
