package com.oocl.bituiga.sw2;

public class DerivedClass extends BaseClass{
	public DerivedClass() {}
	
	@Override
	public String doSomethingAgain() {		
		return "But I have done something else";
	}
	
	public static void main(String args[]) {
		DerivedClass dClass = new DerivedClass();
		
		BaseClass bClass = (BaseClass)dClass;
		
		System.out.println(bClass.doSomethingHere());
		
	}
}
