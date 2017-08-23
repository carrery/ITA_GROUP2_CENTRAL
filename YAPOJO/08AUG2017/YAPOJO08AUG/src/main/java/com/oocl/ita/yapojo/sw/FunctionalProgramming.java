package com.oocl.ita.yapojo.sw;

public class FunctionalProgramming {

	public FunctionalProgramming() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide1(6,0));
		System.out.println(add3(20,100000));
	}
	
	public static int add1(int a, int b) {
		while (b-- > 0) {
			a = ++a;
		}
		return a;
	}
	
	public static int add2(int a, int b) {
		while (b > 0) {
			a++;
			b--;
		}
		return a;
	}
	
	public static int divide1 (int a, int b) {
		return (int)(a / (float) b);
	}
	
	
	public static int add3(int a, int b) {
		return b == 0 ? a : add3(++a, --b);
	}
	

}
