package com.oocl.licupca.hw;

import java.util.Scanner;

public class Exer05 {
	
	// INPUT e é a à
	
	public static void main(String[] args) {
		System.out.println("Enter string to remove whitespace and non-english: ");
		Scanner scanner = new Scanner(System.in);
		String stringInput = removeWhitespaceAndNonEnglish(scanner.nextLine());
		System.out.println(stringInput);
	}
	
	public static String removeWhitespaceAndNonEnglish(String stringInput){
		stringInput = stringInput.replaceAll("\\s+", "").replaceAll("[^\\p{ASCII}]", "");
		return stringInput;
		
	}
	
}
