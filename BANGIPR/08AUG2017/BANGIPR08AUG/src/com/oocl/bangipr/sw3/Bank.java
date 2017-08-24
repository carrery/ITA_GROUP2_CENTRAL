package com.oocl.bangipr.sw3;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		boolean doBank = true;
		CheckingAcc c = new CheckingAcc();
		
		while(doBank) {
			
			System.out.println("Welcome!  Balance, Deposit, Withdraw, or Cancel?");
			Scanner s = new Scanner(System.in);
			String choice = s.next();
			
			if(choice.equals("Balance")) {
				System.out.println(c.Balance());
			} else if (choice.equals("Deposit")) {
				System.out.println("Enter deposit amount:");
				int dep = s.nextInt();
				System.out.println("Depositing "+ dep);
				c.Deposit(dep);
			} else if(choice.equals("Withdraw")) {
				System.out.println("Enter withdraw amount:");
				int wid = s.nextInt();
				System.out.println("Withdrawing "+ wid);
				c.Withdraw(wid);
			} else if (choice.equals("Cancel")) {
				doBank=false;
			}
			
			
		}
		System.out.println("Bank is closed");
		
		
		
		
	}
}
