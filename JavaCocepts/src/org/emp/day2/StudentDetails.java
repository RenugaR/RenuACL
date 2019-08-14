package org.emp.day2;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Student ID");
		int StudentId=sc.nextInt();
		System.out.println("Student ID is " +StudentId);
		System.out.println("Enter Student Name");
		String StudentName=sc.next();
		System.out.println("Student Name is " +StudentName);
		System.out.println("Enter Student Mail ID");
		String StudentMail=sc.next();
		System.out.println("Student Mail ID is " +StudentMail);
		System.out.println("Enter Student Phoneno");
		int StudentPhoneno=sc.nextInt();
		System.out.println("Student ID is " +StudentPhoneno);
		System.out.println("Enter Student Dept");
		String StudentDept=sc.next();
		System.out.println("Student Dept is " +StudentDept);
		System.out.println("Enter Student Gender");
		String StudentGender=sc.next();
		System.out.println("Student Gender is " +StudentGender);
		System.out.println("Enter Student City");
		String StudentCity=sc.next();
		System.out.println("Student Gender is " +StudentCity);

	}

}
