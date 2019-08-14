package org.javaprograms;

import java.util.Scanner;

public class PrimenoPrint {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int count;
		for (int i = 2; i <=n; i++) {
		count=0;
		for (int j = 2; j <= i/2; j++) {
			if(i%j==0) {
				count=1;
				break;
			}
	}if(count==0)
		{
			System.out.println(i);
			}
		}
	}
}