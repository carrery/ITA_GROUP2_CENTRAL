package com.oocl.burgoka.hw6;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Deadlock_hw6 {
	   public static Object Lock1 = new Object();
	   public static Object Lock2 = new Object();
	   
	   public static void main(String args[]) {
		   ThreadDemo1 T1 = new ThreadDemo1();
		   ThreadDemo2 T2 = new ThreadDemo2();
		   T1.start();
		   T2.start();
		   
		   
		   ThreadMXBean bean = ManagementFactory.getThreadMXBean();

		      long ids[] = bean.findMonitorDeadlockedThreads();

		      if(ids != null)
		      {
		          ThreadInfo threadInfo[] = bean.getThreadInfo(ids);

		          for (ThreadInfo threadInfo1 : threadInfo)
		          {
		              System.out.println(threadInfo1.getThreadId());    
		              System.out.println(threadInfo1.getThreadName());  
		              System.out.println(threadInfo1.getLockName());   
		              System.out.println(threadInfo1.getLockOwnerId());  
		              System.out.println(threadInfo1.getLockOwnerName());  
		          }
		      }
		      else
		      {
		          System.out.println("No Deadlocked Threads");
		      }
	   }
	   
	   private static class ThreadDemo1 extends Thread {
	      public void run() {
	         synchronized (Lock1) {
	            System.out.println("Thread 1: Holding lock 1...");
	            
	            try {
	               Thread.sleep(10);
	            }catch (InterruptedException e) {}
	            System.out.println("Thread 1: Waiting for lock 2...");
	            
	            synchronized (Lock2) {
	               System.out.println("Thread 1: Holding lock 1 & 2...");
	            }
	         }
	      }
	   }
	   private static class ThreadDemo2 extends Thread {
	      public void run() {
	         synchronized (Lock1) {
	            System.out.println("Thread 2: Holding lock 1...");
	           
	            try {
	               Thread.sleep(10);
	            }catch (InterruptedException e) {}
	            System.out.println("Thread 2: Waiting for lock 2...");
	            
	            synchronized (Lock2) {
	               System.out.println("Thread 2: Holding lock 1 & 2...");
	            }
	         }
	      }
	   } 
	}