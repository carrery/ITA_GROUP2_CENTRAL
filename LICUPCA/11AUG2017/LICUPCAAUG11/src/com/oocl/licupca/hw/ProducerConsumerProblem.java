package com.oocl.licupca.hw;


public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Process process = new Process();
		new Producer(process);
		new Consumer(process);
	}

}

class Producer implements Runnable {
	Process m = new Process();

	public Producer(Process m) {
		this.m = m;
		new Thread(this, "Produce").start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			m.Question("Producer# 1 put: "+ i);
		}
	}
}

class Consumer implements Runnable {
	Process m = new Process();

	public Consumer(Process m) {
		this.m = m;
		new Thread(this, "Consume").start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			m.Answer("Consumer# 1 got: "+ i);
		}
	}

}

class Process {
	boolean flag = false;

	public synchronized void Question(String msg) {
		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(msg);
		flag = true;
		notify();
	}

	public synchronized void Answer(String msg) {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(msg);
		flag = false;
		notify();
	}
}