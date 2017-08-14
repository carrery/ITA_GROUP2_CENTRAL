package com.oocl.bituiga.sw3;

public class Chatter extends Thread{
	
	public boolean isAsker;
	public String name;

	public Chatter(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		try {
			for(int i = 1; i < 5; i++) {
				if(isAsker) {				
					askQuestion(i);
					isAsker = false;
				}
				else {
	//				this.wait();
					this.answerQuestion(i);
				}
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for(int i = 0; i < 5; i++) {
//			askQuestion(i);
//		}
		
		
	}
	
	public synchronized void askQuestion(int num) {
		String ques = "";
		switch(num) {
			case 1:
				ques = "Hi! How are you?";
				break;
			case 2:
				ques = "How about you?";
				break;
			case 3:
				ques = "Do you find the weather nice today?";
				break;
			case 4:
				ques = "Uhhmm .. Can I go now?";
				break;
			default: 
				ques = "Sorry I did not get that.";
				break;
		}
		isAsker = false;
//		this.notify();
		System.out.println(this.name+ ": " +ques); 
	}
	
	public synchronized void answerQuestion(int num) throws InterruptedException {
		String ans = "";
		switch(num) {
			case 1:
				ans = "Hello! I am fine, thank you for asking";
				break;
			case 2:
				ans = "I am fine also.";
				break;
			case 3:
				ans = "Yes. It's a great day to go out.";
				break;
			case 4:
				ans = "Oh yes . See ya!";
				break;
			default: 
				ans = "Sorry I did not get that.";
				break;
		}
		isAsker = true;
//		this.wait();
		System.out.println(this.name+ ": " +ans); 
	}

}
