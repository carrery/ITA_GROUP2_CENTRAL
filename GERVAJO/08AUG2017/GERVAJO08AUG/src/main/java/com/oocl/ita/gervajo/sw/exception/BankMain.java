package com.oocl.ita.gervajo.sw.exception;


public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount ca = new CheckingAccount(2012300072);
		
		try {
//			ca.deposit(5000);
//			ca.checkBalance();
//			ca.withdraw(300);
//			ca.checkBalance();
			ca = null;
			ca.getBalance();
//		} catch (InsufficientFundException e) {
//			e.printStackTrace();
//			System.err.println("Cannot withdraw amount: " + e.getAmount());
//		} 
		}catch (NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Transaction Completed");
		}

	}

}
