package org.javaprograms;

public class NumbersString {

	public static void main(String[] args) {
		/*
		 * String s="(10-6)=46"; String arrStr[] = s.split("=",2);
		 * System.out.println(arrStr[1]);
		 */
	// I am Travelling
		//gnillevarTamI
		String s="I am Travelling";
		String[] split = s.split(" ");
		int length = split.length;
		for (int i = split[length-1].length()-1 ; i >= 0; i--) {
			char c = split[length-1].charAt(i);
			System.out.print(c);
		}
	}
}


