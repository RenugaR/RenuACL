package org.edu;

public class Arts extends Education{
	public void ug() {
		System.out.println("B.E-CSC");
	}
	public void pg() {
		System.out.println("M.E");
	}
	public void bSc(){
		System.out.println("BSC-MATHS");
	}
	public void bEd() {
		System.out.println("B.ED");
	}
	public void bA() {
		System.out.println("BA");
	}
	public void bBA(){
		System.out.println("BBA");
	}
	public static void main(String[] args) {
		Arts a=new Arts();
		a.bA();
		a.bBA();
		a.bEd();
		a.bSc();
		a.ug();
		a.pg();

	}

}
