package org.emp.day2;

import java.util.Scanner;

public class ScannerDatatype {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Emp ID");
		int empId=sc.nextInt();
		System.out.println("Emp ID is " +empId);
		System.out.println("Enter Emp Name");
		String empName=sc.next();
		System.out.println("Emp Name is " +empName);
		System.out.println("Enter Emp Mail ID");
		String empMail=sc.next();
		System.out.println("Emp Mail ID is " +empMail);
		System.out.println("Enter Emp Phoneno");
		int empPhoneno=sc.nextInt();
		System.out.println("Emp ID is " +empPhoneno);
		System.out.println("Enter Emp Sal");
		int empSalary=sc.nextInt();
		System.out.println(empName+ "Sal is " +empSalary );
		System.out.println("Enter Emp Gender");
		String empGender=sc.next();
		System.out.println("Emp Gender is " +empGender);
		System.out.println("Enter Emp City");
		String empCity=sc.next();
		System.out.println("Emp Gender is " +empCity);
	}

}
