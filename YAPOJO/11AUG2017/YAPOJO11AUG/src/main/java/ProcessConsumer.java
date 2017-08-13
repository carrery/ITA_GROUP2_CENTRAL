import java.util.Scanner;

class ProdCon{
	boolean flag = false;
	
	public synchronized void Producer(String threadName,String message) {
		if(flag) {
			try {
				Thread.sleep(1000);
	            wait(100);
	         }catch (InterruptedException e) {
	            e.printStackTrace();
	         }
		}
		
		System.out.println(threadName  + message);
	    flag = true;
	    notify();
		
	}
	
	public synchronized void Consumer(String threadName, String message) {
		if(!flag) {
			try {
				Thread.sleep(1000);
	            wait();
	           
	         }catch (InterruptedException e) {
	            e.printStackTrace();
	         }
		}
		
		System.out.println(threadName + message);
	    flag = false;
	    notify();
		
	}
	

	
}

class ProducerThread implements Runnable{
	public int y;
	public String threadName;
	
	public ProducerThread(String threadName){
		this.threadName = threadName;
	}
	
	ProdCon prod;
	public ProducerThread(String threadName, ProdCon procon, int y) {
		this.prod = procon;
		this.threadName = threadName;
		this.y = y;
		new Thread(this, "Question").start();
	}
	public void run() {
		for(int i =0; i< y; i++) {
			prod.Producer(threadName, ""+i);
		}
	}
}


class ConsumerThread implements Runnable{
	public int y;	
	public String threadName;
	
	public ConsumerThread(String threadName){
		this.threadName = threadName;
	}

	ProdCon con;
	public ConsumerThread(String threadName, ProdCon procon, int y) {
		this.con = procon;
		this.threadName = threadName;
		this.y=y;
		new Thread(this, "Answer").start();
	}
	public void run() {
		for(int i =0; i< y; i++) {
			con.Consumer(threadName, ""+i);
		}
		
	}
	
}


public class ProcessConsumer {


	public static void main(String[] args) {
		System.out.print("Enter the Number of Producers and Consumers: ");
	    Scanner input1 = new Scanner(System.in);
	    int x = input1.nextInt();
	    System.out.print("Enter the Value(s): ");
	    Scanner input2 = new Scanner(System.in);
	    int y = input2.nextInt();
		
		ProdCon pc = new ProdCon();
		for(int j = 1; j<=x; j++) {
			new ProducerThread("Producer #" + j + " put: ", pc, y);
			new ConsumerThread("Consumer #" + j + " got: ", pc, y);
		}
		
	}

}