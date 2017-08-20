package com.oocl.bituiga.hw5;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Scanner;

public class StringFilter {

	public StringFilter() {
		// TODO Auto-generated constructor stub
	}
	
	static CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder(); // or "ISO-8859-1" for ISO Latin 1
	
	public static boolean isPureAscii(char v) {
		return asciiEncoder.canEncode(v);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();	    
	    
	    String expectedOutput = "";
	    for(char s : input.toCharArray()) {
	    	if(isPureAscii(s)) expectedOutput += s;
	    }
	    expectedOutput = expectedOutput.replaceAll(" ", "");
	    
	    System.out.println("String output: " + expectedOutput);
	}

}
