package org.javaprograms;

import java.util.HashSet;
import java.util.Set;

public class TwoTimesRepeat {
	public static void main(String[] args) {
		String Languages[] = {"Java","SQL","Java","C","C"};
		Set<String> set=new HashSet<String>();
		for (String storeset : Languages) {
			if (set.add(storeset)==false) {
				System.out.println(storeset);
			}
		}
	}
}
		 