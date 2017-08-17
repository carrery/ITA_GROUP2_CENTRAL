package com.oocl.bituiga.hw3;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	private String empId;
    private String name;
    private String company;
     
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
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
     
    public void printEmployee(){
        System.out.println("Employee ID: " + this.empId+" \nEmployee Name: "+this.name+"\nCompany: "+this.company); 
    }
}
