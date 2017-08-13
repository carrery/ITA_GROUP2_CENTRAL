import java.util.Scanner;

class ProdCon{
	boolean flag = false;
	
	public synchronized void Question (String threadName,String message) {
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
	
	public synchronized void Answer (String threadName, String message) {
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

class Thread1 implements Runnable{
	public int y;
	public String threadName;
	
	public Thread1(String threadName){
		this.threadName = threadName;
	}
	
	ProdCon a;
	public Thread1(String threadName, ProdCon a1, int y) {
		this.a = a1;
		this.threadName = threadName;
		this.y = y;
		new Thread(this, "Question").start();
	}
	public void run() {
		for(int i =0; i< y; i++) {
			a.Question(threadName, ""+i);
		}
	}
}


class Thread2 implements Runnable{
	public int y;	
	public String threadName;
	
	public Thread2(String threadName){
		this.threadName = threadName;
	}

	ProdCon a;
	public Thread2(String threadName, ProdCon a1, int y) {
		this.a = a1;
		this.threadName = threadName;
		this.y=y;
		new Thread(this, "Answer").start();
	}
	public void run() {
		for(int i =0; i< y; i++) {
			a.Answer(threadName, ""+i);
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
			new Thread1("Producer #" + j + " put: ", pc, y);
			new Thread2("Consumer #" + j + " got: ", pc, y);
		}
		
	}

}