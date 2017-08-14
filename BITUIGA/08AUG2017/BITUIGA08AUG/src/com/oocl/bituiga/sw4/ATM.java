package com.oocl.bituiga.sw4;

import java.util.Scanner;

public class ATM {
	
//	private 
	
	public ATM() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static String getUserInputStr() {
		Scanner q = new Scanner(System.in);  
		return q.nextLine(); 
	}
	
	public static void main(String[] args) {
		
		Account newAcc = new Account();
		newAcc.accNumber = "123";
		String ops = "";
		boolean isOut = true;
		
		while(isOut) {
		
			System.out.println("*************************************************************************");
			System.out.println("Signing in ... Account Number: "+newAcc.accNumber+"\n\n");
			System.out.println("*************************************************************************\n\n");
			System.out.println("Welcome to this ATM thingy\n\nPlease select what you want to do:");
			System.out.println("(1) Check Balance");
			System.out.println("(2) Deposit Money");
			System.out.println("(3) Withdraw Money");
			System.out.println("(4) Sign Out");
			System.out.print("\n>>>  ");
			ops = getUserInputStr();
			
			switch(Integer.valueOf(ops)) {
			case 1:
				System.out.println("Your current balance is " + newAcc.getBalance());
				System.out.println("Redirecting to Home SCreen...");
				break;
			case 2:
				System.out.println("*Deposit Money*\nEnter money to deposit (Service Charge 15): ");
				do{
					System.out.print("\n>>>  ");
					ops = getUserInputStr();
				}while(ops.matches("\\d"));
				newAcc.depositMoney(Integer.valueOf(ops));
				System.out.println("Money successfully deposited.");
				System.out.println("Redirecting to Home SCreen...");
				break;
			case 3:
				System.out.println("*Withdraw Money*\nEnter money to withdraw (Service Charge 15): ");				
				System.out.print("\n>>>  ");
				ops = getUserInputStr();
				try {
					newAcc.withdrawMoney((Integer.valueOf(ops)));
					System.out.println("Money successfully withdrawn.");
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InsufficientFundsException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Redirecting to Home SCreen...");
				break;
			case 4:
				isOut = false;
				break;
			}
		}
	}
	
	
}
