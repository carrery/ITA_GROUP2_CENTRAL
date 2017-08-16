package com.oocl.licupca.sw;

public class ThreadTestingChat {
	public static void main(String[] args) {
		Chat chat = new Chat();
		new Person1(chat);
		new Person2(chat);
	}

}

class Person1 implements Runnable {
	Chat m = new Chat();
	String[] message = { "Hi", "Will you be my boyfriend?", "Will you marry me?" };

	public Person1(Chat m) {
		this.m = m;
		new Thread(this, "Question").start();
	}

	@Override
	public void run() {
		for (int i = 0; i < message.length; i++) {
			m.Question("Megan Fox: "+message[i]);
		}
	}
}

class Person2 implements Runnable {
	Chat m = new Chat();
	String[] message = { "Hello", "Ok. Whatever.", "*Seen 4:17PM*" };

	public Person2(Chat m) {
		this.m = m;
		new Thread(this, "Answer").start();
	}

	@Override
	public void run() {
		for (int i = 0; i < message.length; i++) {
			m.Answer("Nonie: "+message[i]);
		}
	}

}

class Chat {
	boolean flag = false;

	public synchronized void Question(String msg) {
		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(msg);
		flag = true;
		notify();
	}

	public synchronized void Answer(String msg) {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(msg);
		flag = false;
		notify();
	}
}