package com.oocl.licupca.sw;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount account1 = new CheckingAccount(2012300558,100);
		try {
			account1.deposit(150);
			account1.withdraw(200);
			account1.withdraw(150);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
