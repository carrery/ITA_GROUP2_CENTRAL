package com.oocl.ita.gervajo.sw.functional;

public class MathFunctions {

	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public int substract(int x, int y) {
		int diff = x - y;
		return diff;
	}

	public int factorial(int x) {
		int product = 1;
		if (x == 1) {
		} else {
			product *= x;
			factorial(x - 1);
		}
		return product;
	}

	public int fadd(int a, int b) {
		while (b > 0) {
			a++;
			b--;
		}
		return a;
	}

	public int divide(int a, int b) {
		return (int) (a / (float) b);
		// return a/b;
	}

	public int tadd(int a, int b) {
		return b == 0 ? a : ++a + --b;
	}

}
