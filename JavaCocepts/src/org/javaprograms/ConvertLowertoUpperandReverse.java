package org.javaprograms;

public class ConvertLowertoUpperandReverse	{
	
	public static void main(String[] args) {
	String name="WelcomE";
	StringBuffer b=new StringBuffer(name);
	for (int j = 0; j < name.length(); j++) {
	char ch=name.charAt(j);
	if (Character.isLowerCase(ch)) {
		b.setCharAt(j, Character.toUpperCase(ch));
	}else
		b.setCharAt(j, Character.toLowerCase(ch));
		}System.out.println(b.toString());
	}
}
