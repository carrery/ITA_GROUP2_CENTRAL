class Chat{
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

	public String threadName;
	
	public Thread1(String threadName){
		this.threadName = threadName;
	}
	
	Chat a;
	String[] convo1 = {"Hi", "How are you?", "I'm fine too","Sure. Sounds fun" ,"Bye"};
	public Thread1(String threadName, Chat a1) {
		this.a = a1;
		this.threadName = threadName;
		new Thread(this, "Question").start();
	}
	public void run() {
		for(int i =0; i< convo1.length; i++) {
			a.Question(threadName, convo1[i]);
		}
	}
}


class Thread2 implements Runnable{
	
public String threadName;
	
	public Thread2(String threadName){
		this.threadName = threadName;
	}

	Chat a;
	String[] convo2 = {"Hello", "Fine. How are you?","Wanna watch Game of Thrones today?" ,"Bye"};
	public Thread2(String threadName, Chat a1) {
		this.a = a1;
		this.threadName = threadName;
		new Thread(this, "Answer").start();
	}
	public void run() {
		for(int i =0; i< convo2.length; i++) {
			a.Answer(threadName, convo2[i]);
		}
		
	}
	
}


public class ProcessConsumer {

	public static void main(String[] args) {
		
		Chat a = new Chat();
		new Thread1("Producer : ", a);
		new Thread2("Consumer : ", a);
		
	}

}