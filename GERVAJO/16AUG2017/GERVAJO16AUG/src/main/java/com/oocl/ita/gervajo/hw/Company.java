package com.oocl.ita.gervajo.hw;

public class Company {
	
	private String companyName;
	private String companyAddress;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	
	
	
	public void getCompanyInfo() {
		System.out.println("Company name: " + companyName);
	}

	
}
