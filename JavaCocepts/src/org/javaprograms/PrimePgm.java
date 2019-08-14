package org.javaprograms;

import java.util.Scanner;

public class PrimePgm {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n = s.nextInt();
			int count = 0;
			for (int i = 2; i <= n/2; i++) {
				if (n % i == 0) {
					count = 1;
					break;
				}
			}
			if (count == 0) {
				System.out.println("prime no");
			} else {
				System.out.println("not a prime no");
			}
		}

	}
