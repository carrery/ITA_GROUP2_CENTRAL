package com.oocl.licupca.hw;

public class Employee{

	private String name;
	private String company;
	private String role;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void getDetails() {
		
		System.out.println("Company: " + this.company + "\nName: " + this.name + "\nRole: " + this.role);
	}

}
