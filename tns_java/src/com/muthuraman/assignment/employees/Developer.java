package com.muthuraman.assignment.employees;

public class Developer extends Employee {
	
	private String roleType;
	private int completedTasks;
	
	//getter for roleType
	
	public String getRoleType() {
		return roleType;
	}
	
	//setter for completedTasks
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	
	//getter for completedTasks
	public int getCompletedTasks() {
		return completedTasks;
	}
	
	//setter for completedTasks
	public void setCompletedTasks(int CompletedTasks) {
		this.completedTasks = completedTasks;
	}
	
	
	

}
