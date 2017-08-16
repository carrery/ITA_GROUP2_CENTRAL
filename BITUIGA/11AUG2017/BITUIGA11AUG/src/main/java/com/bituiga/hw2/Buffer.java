package com.bituiga.hw2;

public class Buffer {
		private int contents;
		private boolean isEmpty = true;
		
		public synchronized void putSomething (int item) throws InterruptedException { 
			while (isEmpty == false) { 	//wait till the buffer becomes empty
				try { wait(); }
				catch (InterruptedException e) {throw e;}
			}
			contents = item;
			isEmpty = false;
			System.out.println("Producer: put " + item +" to buffer");
			notify();
		} 
		
		public synchronized int getSomething () throws InterruptedException {
			while (isEmpty == true)  {	
				try { 	wait(); }
				catch (InterruptedException e) {throw e;}
			}
			isEmpty = true;
			notify();
			int val = contents;
			System.out.println("Consumer: got..." + val +" to buffer");
			return val;
		}
	public Buffer() {
		// TODO Auto-generated constructor stub
	}

}
