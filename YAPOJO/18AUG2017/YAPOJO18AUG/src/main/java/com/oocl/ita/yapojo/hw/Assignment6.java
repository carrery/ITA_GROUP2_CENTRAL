package com.oocl.ita.yapojo.hw;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Assignment6 {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo2 t2 = new ThreadDemo2();
		t1.start();
		t2.start();
		detectedDeadlock();

	}
	
	public static void detectedDeadlock() {
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
	    long ids[] = bean.findMonitorDeadlockedThreads();
	    if(ids != null) {	
	    	System.out.println("Deadlocked Threads Existing");
//	        ThreadInfo threadInfo[] = bean.getThreadInfo(ids);
//
//	        for (ThreadInfo threadInfo1 : threadInfo)
//	        {
//	            System.out.println(threadInfo1.getThreadId());    //Prints the ID of deadlocked thread
//	            System.out.println(threadInfo1.getThreadName());  //Prints the name of deadlocked thread
//	            System.out.println(threadInfo1.getLockName());    //Prints the string representation of an object for which thread has entered into deadlock.
//	            System.out.println(threadInfo1.getLockOwnerId());  //Prints the ID of thread which currently owns the object lock
//	            System.out.println(threadInfo1.getLockOwnerName());  //Prints name of the thread which currently owns the object lock.
//	        }
	    } else {
	        System.out.println("No Deadlocked Threads");
	    }
	}
	
	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 1: Holding lock 1");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
				}
				System.out.println("Thread 1: Waiting for lock 2");
				synchronized (lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2");
				}
			}
			
			
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (lock2) {
				System.out.println("Thread 2: Holding lock 2");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
	
				}
				System.out.println("Thread 2: Waiting for lock 1");

				synchronized (lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2");
				}
			}
	
		}
	}
	
	


}
