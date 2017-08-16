package com.bituiga.hw2;

import java.util.Scanner;

public class MainClass {

	public static void main (String [] args) {
	    
		Scanner scanner = new Scanner(System.in);
        int numBuffer = scanner.nextInt();
		
		Buffer theBuffer = new Buffer();
	    
	    Thread theProducer = new Producer(numBuffer, theBuffer);
	    Thread theConsumer = new Consumer(numBuffer, theBuffer);	    
	    theProducer.start();
	    theConsumer.start();
	    
	    try {
	    	theProducer.join();
	    	theConsumer.join();
	    } catch (InterruptedException e) {return;}
	  }

}
