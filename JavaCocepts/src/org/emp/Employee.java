package org.emp;
public class Employee {

		public void empId() {
			System.out.println("Employee ID : 123");
		}
		public void empName() {
			System.out.println("Employee Name : Renu");
		}
		public void empDob() {
			System.out.println("Employee DOB : 07-05-1995");
		}
		public void empPhone() {
			System.out.println("Employee Phone : 12544");
		}
		public void empEmail() {
			System.out.println("Employee Email : adjadjkgk@gmail.com");
		}
		public void empAddress() {
			System.out.println("Employee Address : 122/5,NorthSt");
		}
public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
		
	}

