package com.oocl.ita.gervajo.sw;

public class Employee {
	private String name;
	private String role;
	private String id;
	
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void getEmployeeInfo() {
		System.out.println("Name: " + name + "\nRole: " + role + "\nId: " + id);
	}

}
