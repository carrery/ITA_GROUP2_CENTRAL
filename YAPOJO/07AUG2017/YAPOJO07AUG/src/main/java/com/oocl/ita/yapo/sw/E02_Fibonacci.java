package com.oocl.ita.yapo.sw;
import java.util.Arrays;

class fibonacciThread1 implements Generator<Integer>, Runnable {
	
	private int count;
	private final int n;
	
	public fibonacciThread1(int n) {
		this.n=n; 
	}
	
	public Integer next() { 
		return fib(count++); 
	}
	
	private int fib(int n) {
		if (n<2) {
			return 1;
		}
		return fib(n-2) + fib(n-1);
	}

	public void run() {
		// TODO Auto-generated method stub
		Integer[] sequence = new Integer[n];
		for (int i=0;i<n;i++) {
			sequence[i] = next();
		}
		System.out.println("Seq. of " + n + ": " + Arrays.toString(sequence));
		
	}

}


public class E02_Fibonacci {
	public static void main (String[] args) {
		for (int i=1;i<=13;i++) {
			new Thread(new fibonacciThread1(i)).start();
		}
	}
}