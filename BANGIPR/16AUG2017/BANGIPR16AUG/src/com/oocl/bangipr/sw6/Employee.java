package com.oocl.bangipr.sw6;

import java.util.List;

public class Employee {

	List employeeList;

	public List getEmployeeList() {
		
		System.out.println("Employee List are: " );
		System.out.println("Name: " + employeeList.get(0) );
		System.out.println("Position: " + employeeList.get(1) );
		System.out.println("ID Number: " + employeeList.get(2) );
		return employeeList;
	}

	public void setEmployeeList(List employeeList) {
		this.employeeList = employeeList;
	}

}
