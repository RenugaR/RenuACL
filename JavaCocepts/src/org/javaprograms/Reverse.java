package org.javaprograms;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int c=0;
		for (int i = 1; i < 5; i++) {
			int sum=0,rem=0;
			int number;
			number=i;
		while(number>0)
		{
		rem=number%10;
		sum=(sum*10)+rem;
		number=number/10;
		}
		
			if(i==sum) {
				c++;
						}
					}System.out.println(c);			
		}
}
