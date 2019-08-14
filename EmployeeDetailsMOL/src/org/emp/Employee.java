package org.emp;

public class Employee {
	public void empId() {
		System.out.println("NO Arguments");
	}
	public void empId(int ID) {
		System.out.println("Integer Data Type\n"+ID);
	}
	public void empId(String name) {
		System.out.println("String Data Type\n"+name);
	}
	public void empId(float Sal) {
		System.out.println("Float Data Type\n"+Sal);
	}
	public void empId(Double NetSal) {
		System.out.println("Double Data Type\n"+NetSal);
	}
	public void empId(Boolean b) {
		System.out.println("Boolean Data Type\n"+b);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empId(true);
		e.empId(542745);
		e.empId(564451.545f);
		e.empId(495621516);
		e.empId("Renu");
	}

}
