package com.oocl.burgoka.hw7;

public class Consumer extends Thread{

	public Consumer() {
		// TODO Auto-generated constructor stub
	}
	

	   private Econ ec;
	   private int number;
	   
	   public Consumer(Econ c, int number) {
	      ec = c;
	      this.number = number;
	   }
	   public void run() {
	      int value = 0;
	      for (int i = 0; i < 10; i++) {
	         value = ec.get();
	         System.out.println("Consumer #" + this.number + " got: " + value);
	      }
	   }
	
}
