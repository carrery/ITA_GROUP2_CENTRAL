package com.oocl.bituiga.sw2;

import java.util.Arrays;

public class Sinulid extends Thread{

	private int num;
	private int count;
	private final int n;
	
	public Sinulid(int num, int n) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.n = n;
	}
	public Integer next() {
		return fib(count++);
	}
	private int fib(int n) {
		if(n < 2) return 1;
		return fib(n-2) + fib(n-1);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread " + num + " is running.");
		
		Integer[] sequence = new Integer[n];
//		List sd = new ArrayList();
		for(int i =0; i < n; i++) {
			sequence[i] = next();
		}
		System.out.println("Seq of " + n + ": " + Arrays.toString(sequence));
//		Thread.yield();
		
		System.out.println("Thread " + num + " is ending.");
		
	}
	

}
