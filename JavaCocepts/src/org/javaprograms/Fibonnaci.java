package org.javaprograms;

public class Fibonnaci {

	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <=10; i++) {
			int c=a+b;
			if(c<=10) {
				System.out.println(c);	
			a=b;
			b=c;
			}
		}
	}

}