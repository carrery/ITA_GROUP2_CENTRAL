package com.oocl.bituiga.hw8;

import java.util.ArrayList;
import java.util.List;

public class StringListManips {

	public StringListManips() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ArrayList<String> stringgs = new ArrayList<String>();
		stringgs = fillList();
		ArrayList<String> tempString = new ArrayList<String>();
		int ctr = 0;
		for(String a : stringgs) {
			ctr=0;
			for(String b : stringgs) {
				if(a.equals(b)) {
					ctr++;
				}
			}
			if(ctr == 1) tempString.add(a);
		}
		stringgs.clear();
		stringgs = tempString;
		
		for(String a : stringgs) {
			System.out.println(a);
		}
	}
	
	static ArrayList<String> fillList(){
		ArrayList<String> initInput = new ArrayList<>();
		initInput.add("test");
		initInput.add("test");
		initInput.add("test");
		initInput.add("test");
		initInput.add("test");
		initInput.add("setsw");
		initInput.add("setsw");
		initInput.add("setsw");
		initInput.add("survivor");
		
		return initInput;
	}
}
