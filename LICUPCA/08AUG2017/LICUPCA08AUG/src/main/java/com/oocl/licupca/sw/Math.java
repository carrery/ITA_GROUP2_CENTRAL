package com.oocl.licupca.sw;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
		System.out.println(divide(6,0));
		System.out.println(addRec(20,100000));
	}
	
	public static int add(int x, int y) {
//		return x + y;
		while (y-- > 0) {
			x = ++x;
		}
		return x;
	}
	
//	public static double divide(double x, double y) {
//		if (x!=0 && y !=0)
//			return x / y;
//		return 0;
//	}
	
	public static int divide (int x, int y) {
		return (int)(x / (float) y);
	}
	
	static int addRec(int x, int y) {
		return y == 0 ? x : addRec (++x, --y);
	}

}
