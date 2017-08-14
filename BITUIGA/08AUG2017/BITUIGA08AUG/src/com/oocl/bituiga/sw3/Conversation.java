package com.oocl.bituiga.sw3;

public class Conversation {

	public Conversation() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Chatter p1 = new Chatter("You");
		Chatter p2 = new Chatter("Me");
		
		p1.isAsker = true;
		p2.isAsker = false;
		
		p1.start();
		p2.start();
		
	}
}
