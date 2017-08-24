package com.oocl.bangipr.sw2;

public class DeadLock {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public DeadLock() {
		
	}
	public static void main(String[] args) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();

	}
	
	
	public static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized(Lock1) {
				System.out.println("Thread 1: Holding back lock 1...");
			
			try {
				Thread.sleep(10);
				
			} catch (InterruptedException e) {
				
			}
			System.out.println("Thread 1: Waiting for lock 2");
		
			synchronized(Lock2) {
				System.out.println("Thread 1: holding lock 1 and 2");
			}
				
				
			}
		}

	}
	
	public static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized(Lock1) {
				System.out.println("Thread 2: Holding back lock 1...");
			
			try {
				Thread.sleep(10);
			
			} catch (InterruptedException e) {
				
			}
			System.out.println("Thread 2: Waiting for lock 2");
			
			synchronized(Lock2) {
				System.out.println("Thread 2: holding lock 1 and 2");
			}
				
			}
		}

	}

}
