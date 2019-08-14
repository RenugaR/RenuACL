package org.phone;

public class Phone {
		
	public void phoneInfo(int version,double netrate) {
		System.out.println("Phone Version\t"+version+"\nNetRate\t"+netrate);
	}
	public void phoneInfo(int Serialno,float cost) {
		System.out.println("Phone Serialno\t"+Serialno+"\nCost\t"+cost);
	}
	public void phoneInfo(float cost,int Serialno) {
		System.out.println("Phone cost\t"+cost+"\nSerialno\t"+Serialno);
	}
	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneInfo(2, 465233.55);
		p.phoneInfo(5, 5413.21f);
		p.phoneInfo(5132.5451f, 6);
		

	}

}
