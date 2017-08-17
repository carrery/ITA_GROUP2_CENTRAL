package com.oocl.burgoka.sw3;

public class EmployeeDetails {
	private EmployeeMain employee;
	public String empName;
	public String empRole;
	public String empId;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public void setEmpname(EmployeeMain employee) {
		this.employee = employee;
	}
	
	public void getEmpname() {	
		System.out.println("Employee Name: " + empName);
	}
	
	public void setEmprole(EmployeeMain employee) {
		this.employee = employee;
	}
	
	public void getEmprole() {
		System.out.println("Employee Role: " + empRole);
	}
	
	public void setEmpid(EmployeeMain employee) {
		this.employee = employee;
	}
	
	public void getEmpid() {
		System.out.println("Employee Id: " + empId);
	}
	
	
}
