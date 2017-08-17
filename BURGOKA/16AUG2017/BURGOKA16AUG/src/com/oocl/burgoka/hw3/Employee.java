package com.oocl.burgoka.hw3;

public class Employee {
	 
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
     
    public String infoCompany(){
        return this.empId + " & " + this.name + " & "+ this.company;
    }
     
}