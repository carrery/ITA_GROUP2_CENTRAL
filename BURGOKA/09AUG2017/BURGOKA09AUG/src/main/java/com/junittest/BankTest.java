package com.junittest;

import java.util.Scanner;

public class BankTest {

	public BankTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CheckAccount acnt = new CheckAccount();
		try {
			double fee = 500.00;
			int i = 0;
			System.out.println("Welcome to your account!");

			do {
				Scanner in = new Scanner(System.in);
				System.out.print("DEPOSIT [1] OR WITHDRAW [2] OR BALANCE INQUIRY [3]: ");
				i = in.nextInt();
				double amnt;
				
				if ( i == 1) {
					System.out.print("Input Amount: ");
					amnt = in.nextDouble();
					System.out.println("Depositing..." + amnt); 
					acnt.getDeposit(amnt);
				}
				else if ( i == 2) {
					System.out.print("Input Amount: ");
					amnt = in.nextDouble();
					acnt.getWithdraw(amnt);
					System.out.print("Want to withdraw but you need service fee of 500? (Y|N)");
					String confirm = in.nextLine();
					if(confirm.matches("(y|Y)")) {
						System.out.println("Withdrawing...300.00");
						acnt.serviceFee(fee, amnt);
					}
					else {
						acnt.getWithdraw(amnt);
					}
				}
				else if (i == 3) {
					System.out.println("Balance..." + acnt.totalAmount());
				}
				else {
					System.out.println("Logging out!");
				}
			} while (i != 1 || i != 2);	
				
//			if( i == 1) {
//				acnt.getDeposit(amnt);
//			}
//			else if ( i == 2) {
//				System.out.print("Want to withdraw but you need service fee of 500? (Y|N)");
//				String confirm = in.nextLine();
//				if (confirm.matches("(y|Y)")) {
//					acnt.serviceFee(fee, amnt);
//				}
//				else {
//					acnt.getWithdraw(amnt);
//				}
//			}
//			else
//			{
//				acnt.totalAmount();
//			}
			
//			String confirm = in.nextLine();
//			if (confirm.matches("(y|Y)")) {
//				System.out.println("Withdrawing...300.00");
//				acnt.serviceFee(500.00, 300.00);
//				System.out.println("Total Credit: "+ acnt.totalAmount());
//			} else {
//				System.out.println("Okay Logging out!");
//			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
