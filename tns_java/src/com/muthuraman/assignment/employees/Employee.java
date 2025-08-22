package com.muthuraman.assignment.employees;

public class Employee {
	
	//declaring the private attributes 
	private String name;
	private int employeeId;
	private double salary;
	
	
	//getter  for name
	
	public String getName() {
		return name;
	}
	
	//setter for name
	
	public void setName(String name) {
		this.name=name;
	}
	
	//getter for employeeId
	public int getEmployeeId() {
		return employeeId;
	}
	
	//Setter for employeeId
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	//getter for salary
	public double getSalary() {
		return salary;
	}
	
	//setter for salary
	public void setSalary(double salary) {
		this.salary = salary;
		
	}

}
