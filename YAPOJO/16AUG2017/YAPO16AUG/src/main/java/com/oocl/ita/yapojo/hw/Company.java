package com.oocl.ita.yapojo.hw;

public class Company {

	private String companyName;
	private Employee employee;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getCompanyName() {
		return employee.getCompanyName();
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	

}
