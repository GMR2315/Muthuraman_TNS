package com.muthuraman.assignment.employees;

public class Manager extends Employee {
	
	private String department;
	private int yearsOfExperience;
	
	//getter for department
	public String getDepartment() {
		return department;
	}
	
	//setter for department
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//getter for yearsOfExperience
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	//setter for yearsOfExperience
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
		

}
