package com.muthuraman.assignment.utilities;

import com.muthuraman.assignment.employees.Developer;
import com.muthuraman.assignment.employees.Employee;
import com.muthuraman.assignment.employees.Manager;

public class EmployeeUtilities {
	public static void displayEmployee(Employee emp) {
		System.out.println("name :"+ emp.getName());
		System.out.println("EmployeeId :"+ emp.getEmployeeId());
		System.out.println("Salary :"+ emp.getSalary());
	}
	
	public static void displayManager(Manager m) {
		displayEmployee(m);
		System.out.println("Department :"+ m.getDepartment());
		System.out.println("YearsOfExperience :"+ m.getYearsOfExperience());
	}
	
	public static void displayDeveloper(Developer d) {
		displayEmployee(d);
		System.out.println("Role :"+ d.getRoleType());
		System.out.println("Number of Tasks Completed :"+ d.getCompletedTasks());
	}
}
