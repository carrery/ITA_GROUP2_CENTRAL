package com.prac.junit;

import java.util.Arrays;

public class Palindrome {

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkIfPalindrome(String inStr) {
		
		char[] invert = inStr.toCharArray();
		String checker = "";
		
		for(int i = inStr.length()-1; i >= 0 ; i--) {
			checker+= invert[i];
		}		
		
		if(inStr.equals(checker)) return true;
		else return false;
	}
	
	public String trimVowels(String inStr) {
		
//		if() {
//			
//		}
		
		return "";
	}
	
	

}
