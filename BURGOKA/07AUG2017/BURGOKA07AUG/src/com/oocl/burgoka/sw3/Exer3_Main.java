package com.oocl.burgoka.sw3;


public class Exer3_Main {
	
	public static void main(String[] args) {		
		try {
			throw new Exception1();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			throw new Exception2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			throw new Exception3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
