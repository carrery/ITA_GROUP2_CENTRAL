package com.resource;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CharChecker {
	
static CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder(); 
	
	public static boolean isPureAscii(char v) {
		return asciiEncoder.canEncode(v);
	}
	
	
	public CharChecker() {
		// TODO Auto-generated constructor stub
	}
	

}
