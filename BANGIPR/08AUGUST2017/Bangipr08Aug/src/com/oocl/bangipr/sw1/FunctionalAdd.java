package com.oocl.bangipr.sw1;

public class FunctionalAdd {

	
	public static int add(int a, int b) {
		return a+b;
	}
	
	
	public static int addNum(int x, int y) {
//		while (y > 0) {
//		x++;
//		y--;
//		}
//		
//		return x;
//		
		while(y-->0) {
			x=++x;
		}
		return x;
	}
	
	public  static int Divide(int firstNum, int secondNum) {
		return (int)(firstNum / (float) secondNum);
	}
	
	static int addRec(int x, int y) {
	return y== 0 ?x : addRec(++x, --y);
	}
	
	
	public static void main (String args[]) {
		System.out.println(add(2,3));
		System.out.println(addNum(2,3));
		
		//System.out.println(Divide(6,0));
		
		System.out.println(addRec(9, 777));
	}
	
}
