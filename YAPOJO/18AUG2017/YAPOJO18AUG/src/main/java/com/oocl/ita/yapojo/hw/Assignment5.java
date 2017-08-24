package com.oocl.ita.yapojo.hw;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the String: ");
	    Scanner input = new Scanner(System.in);
	    String string = input.nextLine();
	    String trimString = string.replaceAll(" ", "");
	    
	    final StringBuilder result = new StringBuilder();
	    
	    for (final char ch : trimString.toCharArray()) {
	        final int ascii = ch;
	        if (((ascii >= 33) && (ascii <= 126) && (ascii != 63))) {
	            result.append(ch);
	        }
	    }
	    
	    System.out.println(result);

	}

}
