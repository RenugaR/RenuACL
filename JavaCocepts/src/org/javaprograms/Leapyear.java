package org.javaprograms;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year");
		int n=s.nextInt();
		boolean flag=false;
		if(n%4==0)
		{
			flag=true;
		}
		else if(n%100==0){
			flag=false;
		}
		else if(n%400==0)
		{
			flag=true;
		}
		else 
		{
			flag=false;
		}if(flag) 
		{
			System.out.println(+n+ " is a Leap year");
		}else
		{
			System.out.println(+n+ " is not a Leap year");
		}
	}
}
