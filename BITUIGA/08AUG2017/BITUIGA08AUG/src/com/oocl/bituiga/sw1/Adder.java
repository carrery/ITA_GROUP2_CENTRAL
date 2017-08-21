package com.oocl.bituiga.sw1;

public class Adder {

	public Adder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(8,4));
	}
	
	public static double getSum(double a, double b) {
//		while(b > 0) {
//			a++;
//			b--;
//		}
		return b == 0 ? a : getSum(++a, --b);
	}

}
