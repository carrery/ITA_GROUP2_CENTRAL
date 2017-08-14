package com.oocl.burgoka.hw7;

public class ProdCons_hw7 {
	   public static void main(String[] args) {
	      Econ c = new Econ();
	      Producer p1 = new Producer(c, 1);
	      Consumer c1 = new Consumer(c, 1);
	      p1.start(); 
	      c1.start();
	   }
	}
	
	