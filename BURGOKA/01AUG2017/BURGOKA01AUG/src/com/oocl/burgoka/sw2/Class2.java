package com.oocl.burgoka.sw2;

public class Class2 extends Class1 {
	
	public Class2() {
		
	}
	
	public String Class1() {
		return "Hello";
	}
	
	public static void main(String args[]) {
		Class2 ex = new Class2();
		Class1 ex1 = (Class1)ex;
		System.out.print(ex1.firstMethod());
	}
}
