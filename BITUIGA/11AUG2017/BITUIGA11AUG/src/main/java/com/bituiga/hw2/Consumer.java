package com.bituiga.hw2;

public class Consumer extends Thread{
	private int iterations;
  	private Buffer buffer;
  	
  	public Consumer (int its, Buffer buf) {
  		iterations = its;
  		buffer = buf;
    }
    
    public void run() {
    	int value;
    	for (int i = 0; i < iterations; i++) {
    		try
    		{
    			value = buffer.getSomething();
    		}  catch (InterruptedException e) {return;}
    		try {
    			Thread.sleep(100); 
    		} catch (InterruptedException e) {return;}
    		
    	}
    }

}
