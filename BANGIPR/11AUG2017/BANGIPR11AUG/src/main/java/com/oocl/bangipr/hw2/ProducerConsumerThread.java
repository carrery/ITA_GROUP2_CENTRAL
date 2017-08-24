package com.oocl.bangipr.hw2;

import java.util.LinkedList;

class ProdCon{
	
	LinkedList<Integer> list = new LinkedList<Integer>();;
	 int capacity = 1;
	public synchronized void produceSomething () {
		int val = 0;
		while(true) {
			try {
				
				while (list.size() == capacity)
					wait();
				
				
					System.out.println("Producer produce " +val);
					list.add(val++);
			        notify();
					
				
				Thread.sleep(100);
	         }catch (InterruptedException e) {
	            e.printStackTrace();
	         }
		}
		
	}
	
	public synchronized void consumeSomething () {
		while(true) {
			try {
				while (list.size() == 0)
					wait();
				
				
					int val = list.removeFirst();
					System.out.println("Consumer consumes " + val);
				
			      notify();
					
				
				Thread.sleep(100);
	           
	         }catch (InterruptedException e) {
	            e.printStackTrace();
	         }
		}
		
		
	}
	

	
}

class Thread1 implements Runnable{

	ProdCon c = new ProdCon();
	
	public Thread1(ProdCon c1){
		this.c = c1;
		new Thread(this).start();
	}
	public void run() {
		c.produceSomething();
	}
}


class Thread2 implements Runnable{
	ProdCon c = new ProdCon();
	public Thread2(ProdCon c2){
		this.c = c2;
		new Thread(this).start();
	}
	
	public void run() {
		c.consumeSomething();
	}
	
}


public class ProducerConsumerThread {

	public static void main(String[] args) {
	ProdCon c = new ProdCon();
	new Thread1(c);
	new Thread2(c);

		
	}

}
