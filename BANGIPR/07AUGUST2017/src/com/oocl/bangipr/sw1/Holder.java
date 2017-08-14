package com.oocl.bangipr.sw1;

import java.util.ArrayList;

class Holder1<T> {

	
	public Holder1(){
		
	}
	ArrayList<T> obj = new ArrayList<T>();

	public ArrayList<T> getObj() {
		return obj;
	}

	public void setObj(T string) {
		this.obj.add(string);
	}

}

public class Holder{
	
	public static void main(String args[]) {
		
		Holder1<String> hold = new Holder1<String>();
		
		hold.setObj("A");
		hold.setObj("B");
		hold.setObj("C");
		
		for(String obj : hold.getObj()) {
			System.out.println(obj);
		}
	}
	
}
