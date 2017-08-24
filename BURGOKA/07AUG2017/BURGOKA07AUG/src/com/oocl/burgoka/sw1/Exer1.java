//Create a holder class that holds three objects of the same type,
//along with the methods to store and fetch those objects and a constructor
//to initialize all three

package com.oocl.burgoka.sw1;

import java.util.ArrayList;

public class Exer1<StrObj> {
	
	public Exer1() {
	}
	
	private ArrayList<StrObj> str = new ArrayList<StrObj>();
	
	public ArrayList<StrObj> getObj() {
		return this.str;
	}
	
	public void addObj(StrObj string) {
		this.str.add(string);
	}
	
}
