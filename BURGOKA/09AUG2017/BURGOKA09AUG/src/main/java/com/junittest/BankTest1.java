package com.junittest;

import java.util.ArrayList;
import java.util.Scanner;

public class BankTest1 {

	public BankTest1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CheckAccount acnt = new CheckAccount();
	
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Do you have account password? Y/N: ");
			String yesno = in.nextLine();
			if (yesno.matches("(y|Y)")) {
			System.out.print("Enter Account Password: ");
			String admin = in.nextLine();
			if (acnt.getPassword(admin) == admin) {
				System.out.println("Welcome to your account!");
				System.out.println("Depositing...500");
				acnt.getDeposit(500.00);
				System.out.println("Depositing...500");
				acnt.getDeposit(500.00);
				System.out.println("Withdrawing...500");
				acnt.getWithdraw(500.00);
				System.out.println("Withdrawing...500");
				acnt.getWithdraw(500.00);
				System.out.println("Depositing...100");
				acnt.getDeposit(100.00);
				System.out.println("Withdrawing...200");
				acnt.getWithdraw(200.00);
				System.out.println("Total Amount: "+ acnt.totalAmount());
				System.out.print("Want to withdraw but you need service fee of 500? (Y|N)");
				String confirm = in.nextLine();
				if (confirm.matches("(y|Y)")) {
					System.out.println("Withdrawing...300.00");
					acnt.serviceFee(500.00, 300.00);
					System.out.println("Total Credit: "+ acnt.totalAmount());
				} else {
					System.out.println("Okay Logging out!");
					}
				}
			}
			else if (yesno.matches("n|N")) {
				System.out.print("Enter new account password: ");
				String newpass = in.nextLine();
				acnt.setPassword(newpass);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
