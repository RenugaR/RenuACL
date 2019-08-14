package org.college;

public class CollegeInformation {
	public void collegeName() {
		System.out.println("CollegeName : KCET");
	}
	public void collegeCode() {
		System.out.println("CollegeCode : 1234");
	}
	public void collegeRank() {
		System.out.println("CollegeRank : A");
	}
public static void main(String[] args) {
	CollegeInformation ci=new CollegeInformation();
	Student s=new Student();
	Hostel h=new Hostel();
	Dept d = new Dept();
	ci.collegeName();
	ci.collegeCode();
	ci.collegeRank();
	s.studentName();
	s.studentID();
	s.studentDept();
	h.hostelName();
	d.depName();
	}
}