package org.javaprograms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int oddeven = s.nextInt();
		int number;
		number=(oddeven/2)*2;
		if(number==oddeven)
		{
			System.out.println("Even");
		}else
		{
			System.out.println("Odd");
		}
	}

}
