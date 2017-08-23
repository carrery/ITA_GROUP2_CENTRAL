package com.oocl.ita.yapo.sw;

class multiThreading extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	
	public static void main(String[] args) {
		multiThreading thread1 = new multiThreading();
		thread1.start();
		
		multiThreading thread2 = new multiThreading();
		thread2.start();
	}

}

