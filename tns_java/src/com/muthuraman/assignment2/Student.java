package com.muthuraman.assignment2;
import java.util.*;

public class Student{
	


		
		private String name;
		private long roll_no;
		private char Grade;
		private float percent;
		
		public Student() {
			System.out.println("Student object is created");		}
		
		
		
		public void studentDetails() {
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter your Name:");
			String name = sc.nextLine();
		
			System.out.println("Enter your Roll Number:");
			long roll_no = sc.nextLong();
		
		
		
			System.out.println("Enter your Grade:");
			char Grade = sc.next().charAt(0);
		
			System.out.println("Enter your Percentage:");
			float percent = sc.nextFloat();
		
			sc.close();
		}	
		
		public void diplayStudent() {
			System.out.println("Student Deatils");
			System.out.println(name);
			System.out.println(roll_no);
			System.out.println(Grade);
			System.out.println(percent+"%");
		}
		
		
	
		
		

		public static void main(String[] args) {
			Student stud = new Student();
			
			stud.studentDetails();
			stud.diplayStudent();
			
			
			

		}

	}


