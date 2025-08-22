package com.muthuraman.assignment2;

import java.util.Scanner;

public class Circle {
	private float Radius;
	private String Color;
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Radius of the circle :");
		Radius = sc.nextFloat();
		System.out.println("Enter the Color of the circle :");
		sc.nextLine();
		
		Color = sc.nextLine();
		
		sc.close();
		
	}
	
	public void calArea() {
		double Area = (Radius*Radius*3.14);
		System.out.printf("Area of the Circle : %.2f\n", Area);
		System.out.println("Color of the Circle :"+ Color);
		
		
	}

	public static void main(String[] args) {
		Circle circle =new Circle();
		
		circle.getInput();
		circle.calArea();

	}

}
