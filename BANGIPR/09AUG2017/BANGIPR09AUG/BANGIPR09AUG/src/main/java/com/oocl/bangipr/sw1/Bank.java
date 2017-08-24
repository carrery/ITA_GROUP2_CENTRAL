package com.oocl.bangipr.sw1;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		//boolean doBank = true;
		
		Scanner s = new Scanner(System.in);
		String choice = s.next();
		
		System.out.println("Username");
		String user = s.next();
		login(user);
		//DoBanking(doBank);
	}
	
	
	public static String login(String s) {
		
		
		if(s.equals("Admin")) {
			DoBanking(true);
			
			return s;
		} else {
			DoBanking(false);
			System.out.println("WRONG CREDENTIALS");
			return s;
		}
	}
	public static  boolean DoBanking(boolean x) {
		Scanner s = new Scanner(System.in);
		String choice = s.next();
		CheckingAcc c = new CheckingAcc();
			while(x) {
			System.out.println("Welcome!  Balance, Deposit, Withdraw, or Cancel?");
			
			
			if(choice.equals("Balance")) {
				System.out.println(c.Balance(choice));
			} else if (choice.equals("Deposit")) {
				System.out.println("Enter deposit amount:");
				int dep = s.nextInt();
				System.out.println("Depositing "+ dep);
				c.Deposit(choice,dep);
			} else if(choice.equals("Withdraw")) {
				System.out.println("Enter withdraw amount:");
				int wid = s.nextInt();
				System.out.println("Withdrawing "+ wid);
				c.Withdraw(choice,wid);
			} else if (choice.equals("Cancel")) {
				x=false;
			}
			
			
		}
		System.out.println("Bank is closed");
		return x;
	}
	
}
