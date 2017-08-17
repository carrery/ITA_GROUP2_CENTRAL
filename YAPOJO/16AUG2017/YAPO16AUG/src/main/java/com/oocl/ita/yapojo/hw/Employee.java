package com.oocl.ita.yapojo.hw;

public class Employee{

	private String company;
	private String name;
	private String role;
	
	
	
	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
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



	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public void getDetails() {
		
		System.out.println("Company: " + this.company + "\nName: " + this.name + "\nRole: " + this.role);
	}

}
