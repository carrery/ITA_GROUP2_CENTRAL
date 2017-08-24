package com.oocl.bituiga.sw1;

import java.util.ArrayList;

public class HolderClass<NewObject> {

	private ArrayList<NewObject> members = new ArrayList<NewObject>();
	
	public HolderClass() {
		// TODO Auto-generated constructor stub		
	}
	
	public ArrayList<NewObject> getObjects(){		
		return this.members;
	}
	
	public void addObject(NewObject newObj) {
		this.members.add(newObj);
	}
	
	public NewObject getMember(int index) {
		return members.get(index);
	}
	
}
