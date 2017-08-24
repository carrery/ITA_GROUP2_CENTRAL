package com.oocl.burgoka.sw5;

public class Dog {
	public static String Behave(int a) {
		a = (a == 8) ? 0 : 1;
		String first = String.valueOf(a);
		return first;
	}
	
//	public static String Behave(String b) {
//		b = "Bark";
//		return b;
//	}
	
	public static String Behave(boolean c) {
		c = false;
		String third = Boolean.toString(c);
		return third;
	}
	
	public static void main(String args[]) {
		
		int a = 8; 
		String fi = Behave(a);
		String first = Integer.parseInt(fi) == 0 ? "Bark" : "Not Barking";
		System.out.print(first + "\n");
		
//		String b = "Bark";
//		String se = Behave(b);
//		String second = se ==  "Bark" ? "Howling" : "Not Howling";
//		System.out.print(second + "\n");
		
		boolean c = false;
		String th = Behave(c);
		String third =  th == "false" ? "Crying" : "Not Crying";
		System.out.print(third + "\n");
		
		
		
		
	}
}

