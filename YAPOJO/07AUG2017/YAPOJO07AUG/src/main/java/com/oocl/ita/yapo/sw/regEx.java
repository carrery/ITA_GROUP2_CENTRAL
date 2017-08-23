package com.oocl.ita.yapo.sw;

import java.util.Scanner;

public class regEx {

	public regEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sign Up");
		
		Scanner uname = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username = uname.nextLine();
		
		if(username.matches("^[a-zA-Z0-9]{5,}$")) {
			Scanner pword = new Scanner(System.in);
			System.out.println("Enter Password: ");
			String password = pword.nextLine();
			
			if(password.matches("^[a-zA-Z0-9_.-]{8,}$")) {
				Scanner cpword = new Scanner(System.in);
				System.out.println("Confirm Password: ");
				String cpassword = cpword.nextLine();
				
				if (cpassword.equalsIgnoreCase(password)) {
					System.out.println("Matched!");
					System.out.println("Successfully signed up!");
				}
			} else if (password.length() < 8) {
				System.out.println("Password must be greater than 8 characters");
			} else {
				System.out.println("Password can only contains alphanumeric characters and - _ .");
			}
		} else if (username.length() < 5) {
			System.out.println("Username must be greater than 5 characters");
		} else {
			System.out.println("Username can only contains alphanumeric characters");
		}
		
	}

}
