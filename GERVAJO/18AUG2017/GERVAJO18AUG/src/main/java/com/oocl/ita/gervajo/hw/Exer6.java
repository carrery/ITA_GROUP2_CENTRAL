	package com.oocl.ita.gervajo.hw;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Exer6 {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String args[]) {
		
		
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();
		detectDeadlock();

	}

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Holding lock 1...");

				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for lock 2...");

				synchronized (Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread 2: Holding lock 1...");

				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 2...");

				synchronized (Lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}
	
	private static void detectDeadlock() {
		ThreadMXBean tmx = ManagementFactory.getThreadMXBean();
		long[] ids = tmx.findDeadlockedThreads();
		if (ids != null) {
			ThreadInfo[] infos = tmx.getThreadInfo(ids, true, true);
			System.out.println("The following threads are deadlocked:");
			for (ThreadInfo ti : infos) {
				System.out.println(ti);
			}
		}
		
	}
}