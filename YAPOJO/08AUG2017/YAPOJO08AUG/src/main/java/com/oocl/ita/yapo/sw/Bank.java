package com.oocl.ita.yapo.sw;

public class Bank {

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		CheckAccount checkAccount = new CheckAccount();
		try {
//			checkAccount.checkBalance();
//			checkAccount.deposit(500);
//			checkAccount.withdraw(100);
//			checkAccount.deposit(900);
//			checkAccount.withdraw(600);
//			checkAccount.withdraw(1000);
			checkAccount = null;
		} catch (NullPointerException exception) {
			System.err.println("The object is null " + exception.getMessage());
		} finally {
			System.err.println(checkAccount.toString());
		}
//		catch (InsufficientFundsException exception) {
//			exception.printStackTrace();
//			System.err.println("Insufficient balance and cannot withdraw " + exception.getAmount());
//		}
	}

}
