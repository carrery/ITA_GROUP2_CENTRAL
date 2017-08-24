package com.oocl.burgoka.sw2;

public class Exer2_Main {
	
	public static void main(String[] args) {
		Class1 cls = null;
		try {
			cls.firstMethod();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Done...");
		}
	}

}
