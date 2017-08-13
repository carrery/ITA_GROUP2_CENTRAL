package com.bituiga.hw2;

public class Producer extends Thread{

	private int iterations;
  	private Buffer buffer;
  	
  	public Producer (int its, Buffer buf) {
  		iterations = its;
  		buffer = buf;
    }
    
    public void run() {
    	for (int i = 0; i < iterations; i++) {
    		try {
    			Thread.sleep(100); 
    		} catch (InterruptedException e) {return;}
    		
    	    try {
    	    	buffer.putSomething(i + 1); 
    	    } catch (InterruptedException e) {return;}
    		
    	}
    }

}
