package com.assignment.main;

import com.muthuraman.assignment.employees.Developer;
import com.muthuraman.assignment.employees.Manager;
import com.muthuraman.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		Manager Manager = new Manager();
		Manager.setName("Tennyson");
		Manager.setEmployeeId(7);
		Manager.setSalary(100000);
		Manager.setDepartment("Finance");
		Manager.setYearsOfExperience(10);
		
		Developer dev = new Developer();
		dev.setName("Benjamin");
		dev.setEmployeeId(01);
		dev.setRoleType("Backend Developer");
		dev.setSalary(70000);
		dev.setCompletedTasks(7);
		System.out.println("-----------------Employee Details-------------------");
		EmployeeUtilities.displayEmployee(dev);
		System.out.println("-----------------Developer Details-------------------");
		EmployeeUtilities.displayDeveloper(dev);
		System.out.println("-----------------Manager Details-------------------");
		EmployeeUtilities.displayManager(Manager);
		

	}

}
