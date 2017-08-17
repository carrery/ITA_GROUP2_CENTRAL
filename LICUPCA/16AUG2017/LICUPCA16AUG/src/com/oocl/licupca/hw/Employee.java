package com.oocl.licupca.hw;

import org.springframework.beans.factory.annotation.*;

public class Employee{

	private String name;
//	@Required
	private String company;
	private String role;
	
	public String getName() {
		return name;
	}

//	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCompany() {
		return company;
	}

	@Required
	public void setCompany(String company) {
		this.company = company;
	}

	public String getRole() {
		return role;
	}
	
//	@Required
	public void setRole(String role) {
		this.role = role;
	}

	public void getDetails() {
		
		System.out.println("\nName: " + this.name + "\nCompany: " + this.company +  "\nRole: " + this.role);
	}

}
