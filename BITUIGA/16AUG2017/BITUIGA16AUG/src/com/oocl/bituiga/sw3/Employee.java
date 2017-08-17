package com.oocl.bituiga.sw3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.bituiga.sw2.Shape;

public class Employee {
	
	public String name;
	public String role;
	public String emp_id;

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
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static void main(String[] args) {		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("OtherBean.xml");
		Employee emp1 = (Employee) ctx.getBean("bayani");
		
		System.out.println("Employee ID: " + emp1.getEmp_id());
		System.out.println("Employee Name: " + emp1.getName());
		System.out.println("Employee Role: " + emp1.getRole());
		
	}
}
