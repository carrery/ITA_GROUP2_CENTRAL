package com.oocl.bituiga.hw8;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringListManips {

	public StringListManips() {
		// TODO Auto-generated constructor stub
	}
	
static CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder(); // or "ISO-8859-1" for ISO Latin 1
	
	public static boolean isPureAscii(String v) {
		return asciiEncoder.canEncode(v);
	}
	
	public static void main(String[] args) {
		ArrayList<String> stringgs = new ArrayList<String>();
		ArrayList<String> tempstringgs = new ArrayList<String>();
		stringgs = fillList();
		stringgs =  (ArrayList<String>)stringgs.stream().distinct().collect(Collectors.toList());
		
		for(String a : stringgs) {
			if(!isPureAscii(a)) tempstringgs.add(a);
		}
		
		for(String a : tempstringgs) {
			if(!isPureAscii(a)) stringgs.remove(a);
		}
		
		for(String a : stringgs) {
			System.out.println(a);
		}
	}
	
	static ArrayList<String> fillList(){
		ArrayList<String> initInput = new ArrayList<>();
		initInput.add("国内版");
		initInput.add("国内版");
		initInput.add("国内版");
		initInput.add("test");
		initInput.add("test");
		initInput.add("setsw");
		initInput.add("setsw");
		initInput.add("setsw");
		initInput.add("survivor");
		
		return initInput;
	}
}
