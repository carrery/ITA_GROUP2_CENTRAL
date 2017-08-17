package com.oocl.licupca.sw.exercise6;

public class Employee {


	private String name;
	private String role;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public void printDetails() {
		System.out.println("\nName: " + getName() + "\nID: " + getId() + "\nRole: "+ getRole());
	}

}
