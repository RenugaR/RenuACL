package org.javaprograms;

import java.util.Scanner;

public class SwapTwonumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c;
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Before Swapping A Value "+a);
		System.out.println("Enter the Second number");
		int b = s.nextInt();
		System.out.println("Before Swapping B Value "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping "+a);
		System.out.println("After Swapping "+b);
		
	}

}
