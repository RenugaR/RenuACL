package org.javaprograms;

public class Armstrong {

	public static void main(String[] args) {
	int a,sum,temp;
	a=153;
	sum=0;
	temp=a;
	while(a>0)
	{
		int rem=a%10;
		sum=(rem*rem*rem)+sum;
		a=a/10;
	}
		System.out.println(sum);
	if(sum==temp)
	{
		System.out.println("Armstrong number");
	}else
	{
		System.out.println("Not an Armstrong number");
	}
	}
}
