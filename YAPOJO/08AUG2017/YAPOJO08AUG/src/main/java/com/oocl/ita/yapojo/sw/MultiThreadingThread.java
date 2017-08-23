package com.oocl.ita.yapojo.sw;

class MultiThreadingThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("Running " + Thread.currentThread().getName() + ": Execution (" + i + ")");
			try {
				Thread.sleep(100);
				if(i==5) {
					Thread.interrupted();
					Thread.yield();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	
	public static void main(String[] args) {
		MultiThreadingThread thread1 = new MultiThreadingThread();
		thread1.setName("Thread 1");
		thread1.start();
		
		MultiThreadingThread thread2 = new MultiThreadingThread();
		thread2.setName("Thread 2");
		thread2.start();
	}

}

