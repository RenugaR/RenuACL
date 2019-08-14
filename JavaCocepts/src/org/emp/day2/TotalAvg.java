package org.emp.day2;

import java.util.Scanner;

public class TotalAvg {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Student ID");
		int StudentId=sc.nextInt();
		System.out.println("Student ID is " +StudentId);
		System.out.println("Enter Student Name");
		String StudentName=sc.next();
		System.out.println("Student Name is " +StudentName);
		System.out.println("Enter Mark1");
		int mark1=sc.nextInt();
		System.out.println("Enter Mark2");
		int mark2=sc.nextInt();
		System.out.println("Enter Mark3");
		int mark3=sc.nextInt();
		System.out.println("Enter Mark4");
		int mark4=sc.nextInt();
		System.out.println("Enter Mark5");
		int mark5=sc.nextInt();
		int t1=mark1+mark2+mark3+mark4+mark5;
		System.out.println("Total Marks : " +t1);
		int avg=t1/5;
		System.out.println("Avg : " +avg);
	}

}
