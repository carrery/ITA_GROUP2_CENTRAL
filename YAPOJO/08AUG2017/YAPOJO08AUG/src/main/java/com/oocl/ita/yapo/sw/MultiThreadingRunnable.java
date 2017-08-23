package com.oocl.ita.yapo.sw;

class SomethingThread implements Runnable {
	
	String threadName;
	Thread thread;
	
	public SomethingThread(String name) {
		threadName = name;
		System.out.println("Creating thread: " + threadName);
	} 


	public void run() {
		System.out.println("Starting " + threadName);
		for(int i=4;i>=0;i--) {
			System.out.println(threadName + " Still running ... " + i);
			try {
				System.out.println(threadName + " Sleeping");
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting " + threadName);
	} 
	
	public void start() {
		System.out.println("Starting " + threadName );
		thread = new Thread(this, threadName);
		thread.start();
	} 
	
	
}

public class MultiThreadingRunnable{

	public MultiThreadingRunnable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SomethingThread thread1 = new SomethingThread("Thread 1");
		thread1.start();
		
		SomethingThread thread2 = new SomethingThread("Thread 2");
		thread2.start();
		
		
	}
}
