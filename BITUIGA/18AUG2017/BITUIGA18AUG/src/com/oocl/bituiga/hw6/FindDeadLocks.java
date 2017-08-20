package com.oocl.bituiga.hw6;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class FindDeadLocks {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public FindDeadLocks() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Threaaaad thread1 = new Threaaaad();
		Threaaaadssss thread2 = new Threaaaadssss();
		thread1.start();
		thread2.start();

		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		long ids[] = bean.findMonitorDeadlockedThreads();

		if (ids != null) {
			System.out.println("Deadlocks Found.");
		} else {
			System.out.println("No Deadlocks.");
		}
	}

	private static class Threaaaad extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Holding lock 1...");
				System.out.println("Thread 1: Waiting for lock 2...");
				synchronized (Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}

	private static class Threaaaadssss extends Thread {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread 2: Holding lock 2...");
				System.out.println("Thread 2: Waiting for lock 1...");

				synchronized (Lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}

}
