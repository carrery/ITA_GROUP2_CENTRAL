package com.app;

public class SpecialChar {
	
	// INPUT eéaà
	private String result;
	private String origString;
	
	public static String removeWhitespaceAndNonEnglish(String stringInput){
		stringInput = stringInput.replaceAll("\\s+", "").replaceAll("[^\\p{ASCII}]", "");
		return stringInput;
	}
	
	public SpecialChar(String result) {
		this.result = removeWhitespaceAndNonEnglish(result);
		this.origString = result;
	}
	
	public String getResult() {
		return "Original String: " +this.origString + "\nNew string is: " + this.result;
	}
	
}
