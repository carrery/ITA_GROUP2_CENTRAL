package com.oocl.bangpr.hw6;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;


public class detectDeadlock {
	
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();	
	
	public static void main(String[] args) {
	
		makeAThread();
		detectDeadlock();
	
	}
	
	public static void detectDeadlock() {
	    ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
	    long[] deadThread = threadBean.findDeadlockedThreads();
	    int numOfDead = deadThread != null? deadThread.length : 0;
	    System.out.println("Number of deadlocked threads: " + numOfDead);
	}
	
	private static void makeAThread() {
	  
	    Thread thread1 = new Thread(new Runnable() {
	        @Override public void run() {
	            synchronized (lock1) {
	                System.out.println("Thread1 running lock1");
	                try {
	                    TimeUnit.MILLISECONDS.sleep(50);
	                } catch (InterruptedException ignore) {}
	                synchronized (lock2) {
	                    System.out.println("Thread1 running lock2");
	                }
	            }
	        }
	 
	    });
	    thread1.start();
	 
	    Thread thread2 = new Thread(new Runnable() {
	        @Override public void run() {
	            synchronized (lock2) {
	                System.out.println("Thread2 runnning lock2");
	                try {
	                    TimeUnit.MILLISECONDS.sleep(50);
	                } catch (InterruptedException ignore) {}
	                synchronized (lock1) {
	                    System.out.println("Thread2 running lock1");
	                }
	            }
	        }
	    });
	    thread2.start();
	 
	    try {
	        TimeUnit.MILLISECONDS.sleep(100);
	    } catch (InterruptedException ignore) {}
	}

}
