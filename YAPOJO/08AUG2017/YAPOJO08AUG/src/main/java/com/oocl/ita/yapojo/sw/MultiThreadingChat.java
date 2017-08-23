package com.oocl.ita.yapojo.sw;

class Chat {
	boolean flag = false;
	public synchronized void Question(String name, String msg) {
		if(flag) {
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.print(name + " ");
		System.out.println(msg);
		flag = true;
		notify();
		
	}
	
	public synchronized void Answer(String name, String msg) {
		if(!flag) {
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.print(name + " ");
		System.out.println(msg);
		flag = false;
		notify();
	}
	
}

class Person1 implements Runnable {
	Chat ch;
	String[] Question = {"Hey?","Gail?","Hey!ppy Birthday to you!"};


	public void run() {
		// TODO Auto-generated method stub
		for(int a=0; a < Question.length; a++ ) {
			ch.Question("Person 1:", Question[a]);
		}
	}
	
	public Person1(String threadName, Chat chat) {
		this.ch = chat;
		new Thread(this, "Question").start();
	}
	
}

class Person2 implements Runnable {
	Chat ch;
	String[] Answer = {"Hey!","Yes?","Thank you!"};


	public void run() {
		// TODO Auto-generated method stub
		for(int a=0; a < Answer.length; a++ ) {
			ch.Answer("Person 2:", Answer[a]);
		}
	}
	
	public Person2(String threadName, Chat chat) {
		this.ch = chat;
		new Thread(this, "Answer").start();
	}
	
}

public class MultiThreadingChat {

	public MultiThreadingChat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat chat = new Chat();
		new Person1("Thread 1", chat);
		new Person2("Thread 2", chat);

	}

}
