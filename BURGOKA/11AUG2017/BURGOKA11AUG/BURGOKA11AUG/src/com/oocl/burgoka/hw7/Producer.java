package com.oocl.burgoka.hw7;

public class Producer extends Thread {

	public Producer() {
		// TODO Auto-generated constructor stub
	}
	
	   private Econ ec;
	   private int number;
	   public Producer(Econ c, int number) {
	      ec = c;
	      this.number = number;
	   } 
	   public void run() {
	      for (int i = 0; i < 10; i++) {
	         ec.put(i);
	         System.out.println("Producer #" + this.number + " put: " + i);
	         try {
	            sleep((int)(Math.random() * 100));
	         } catch (InterruptedException e) { }
	      } 
	   }
	
}
