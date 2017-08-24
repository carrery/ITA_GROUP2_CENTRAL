package com.oocl.burgoka.sw2;

//import com.multithread.Chat;
//import com.multithread.Chat1;

class Chat{
	boolean ques = false;
	
	public synchronized void Question(String msg) {
		if (ques) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		ques = true;
		System.out.print(msg);
		notify();
	}
		
	
	public synchronized void Answer(String msg) {
		if(!ques) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ques = false;
		System.out.print(msg);
		notify();
	}
	
}

class Chat1 implements Runnable {
	Chat m;
	String [] question = {"Hi", "Are you feeling good today?", "Really?", "Okay"};
	public Chat1 (Chat m1) {
		this.m = m1;
		new Thread(this, "Question").start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		for (int i = 0 ; i < question.length ; i++) {
			m.Question(question[i] + "\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Chat2 implements Runnable {
	Chat m;
	String [] answer = {"Hello", "Not fine :( LOL", "Just joking", "Okay :)"};
	public Chat2 (Chat m2) {
		this.m = m2;
		new Thread(this, "Answer").start();
	}
	
	@Override
	public void run() {
		for (int i = 0 ; i < answer.length ; i++) {
			m.Answer(answer[i] + "\n");
		}
	}
		// TODO Auto-generated method stub //new Thread(this, "Answer").start(); //new Thread(this, "Question").start();
	}
	
public class ChatPractice {	
	public static void main(String[] args) {
		Chat chmsg = new Chat();
		new Chat1(chmsg);
		new Chat2(chmsg);
	}
}
