package com.oocl.gervajo.hw.hanoi;

class Process {

	boolean flag = false;

	public synchronized void produce(int i) {
		if (flag) {
			try {
				Thread.sleep(1000);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Producer put : " + i);
		flag = true;
		notify();

	}

	public synchronized void consume(int i) {
		if (!flag) {
			try {
				Thread.sleep(1000);
				wait();


			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumer got : " + i);
		flag = false;
		notify();
	}
}

class Producer implements Runnable {
	
	Process p;
	
	public Producer(Process p1) {
		this.p = p1;
		new Thread(this).start();
	}
	

	public void run() {
		// TODO Auto-generated method stub
		for(int i =1; i<=5; i++) {
			p.produce(i);
		}
	}

}

class Consumer implements Runnable {
	
	Process p;
	
	public Consumer(Process p2) {
		this.p = p2;
		new Thread(this).start();
	}
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1; i<=5; i++) {
			p.consume(i);
		}
	}

}

public class Homework2 {

	public static void main(String[] args) {
		Process p = new Process();
		new Producer(p);
		new Consumer(p);
	}
}
