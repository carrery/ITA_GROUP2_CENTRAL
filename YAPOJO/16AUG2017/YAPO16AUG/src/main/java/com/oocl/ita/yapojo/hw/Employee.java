package com.oocl.ita.yapojo.hw;

public class Employee extends Company{

	private String companyName;
	private String employeeName;
	
	public String getCompanyName() {
		return "OOCL";
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
