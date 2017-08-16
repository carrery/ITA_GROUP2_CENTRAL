package com.oocl.ita.gervajo.sw.thread;

public class ChatThread {
	public static void main(String[] args) {
		Chat ch = new Chat();
		new P1(ch);
		new P2(ch);

	}
}

class Chat {
	boolean flag = false;

	public synchronized void q(String msg) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(800);
		} catch (Exception e) {
		}
		System.out.println("PERSON 1: " + msg);
		flag = true;
		notify();
	}

	public synchronized void a(String msg) {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(800);
		} catch (Exception e) {
		}
		System.out.println("PERSON 2: " + msg);
		flag = false;
		notify();
	}

}

class P1 implements Runnable {

	Chat ch;
	String[] Question = { "Hey", "What's up?", "I'm doing just fine before I met you",
			"I drink too much but that's not an issue I'm okay" };

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < Question.length; i++) {
			ch.q(Question[i]);

		}

	}

	public P1(Chat ch1) {
		this.ch = ch1;
		new Thread(this, "Question").start();
	}

}

class P2 implements Runnable {

	Chat ch;
	String[] Question = { "Heyyyy", "I'm good, how about you?", "What?", "Lol" };

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < Question.length; i++) {
			ch.a(Question[i]);
		}
	}

	public P2(Chat ch2) {
		this.ch = ch2;
		new Thread(this, "Question").start();
	}

}
