package com.muthuraman.assignment2;

import java.util.Scanner;

public class Commission {
	private String Name;
	private String Address;
	private long Phone;
	private double Sales_amount;
	
	
	public void acceptEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		Name = sc.nextLine();
		System.out.println("Enter Address:");
		Address = sc.nextLine();
		System.out.println("Enter phone number:");
		Phone = sc.nextLong();
		System.out.println("Enter Sales_amount:");
		Sales_amount = sc.nextDouble();
		
		
		
	}
	
	
	public void calculateCommission() {
		double commission = 0;
		if(Sales_amount >= 100000) {
			commission = Sales_amount*0.10;
		}
		else if(Sales_amount>= 50000 && Sales_amount< 100000) {
			commission = Sales_amount*0.05;
			
		}
		else if(Sales_amount>= 30000 && Sales_amount< 50000) {
			commission = Sales_amount*0.03;
			
		}
		else if(Sales_amount<30000) {
			System.out.println("No Commission");
		}
		
		if(Sales_amount<30000) {
			commission = Sales_amount * 0;
		}
		
		if(commission>0) {
			System.out.println("Commission"+ commission);
		}
		else {
			System.out.println("No commission");
		}
			
		
		
	}
	
	

	public static void main(String[] args) {
		Commission commission = new Commission();
		
		commission.acceptEmployeeDetails();
		commission.calculateCommission();
		
		

	}

}
