package com.oocl.bangipr.hw3;

/*
 * A spring bean definition contains lot of information like property values, constructor arguments, and container specific information like init and destroy method settings and so on. Spring allows to inherit all these bean properties. A child bean definition can inherit configurations from its parent definition. The child bean definition can override some values, or add new values. Please write code to inherit parent bean values with in child bean. You may have Employee class, the parent bean sets the common value for the property called company. Any other bean definitions will inherits it.
 * 
 */
public class Employee {
	
		String name;
		String role;
		String employeeId;
		String company;
		
		
		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public Employee() {
			
		}

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

		public String getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}
		
		public void printEmp() {
			System.out.println("Name: "+ this.name);
			System.out.println("Role: "+ this.role);
			System.out.println("Employee Id: "+ this.employeeId);
			System.out.println("Company: "+ this.company);
			System.out.println("");
			
		}


}
