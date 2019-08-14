package org.add;

public class GreensTech {
	public void greensOmr(int Stucount) {
		System.out.println("Total Students Count : "+Stucount);
	}
	public void greensOmr(String InsName) {
		System.out.println("Institute name : "+InsName);
	}
	public void greensOmr(String Founder,int BatchDays) {
		System.out.println("Institute founder : "+Founder+"\nBatchdays : "+BatchDays);
	}
	public void greensOmr(int BatchDays,String Founder) {
		System.out.println("Batchdays : "+BatchDays+"\nInstitute founder : "+Founder);
	}
	public void greensOmr(int BatchDays,String Organiser,String Phoneno) {
		System.out.println("Batchdays : "+BatchDays+"\nInstitute Organiser : "+Organiser+"\nPhone no : "+Phoneno);
	}
	public static void main(String[] args) {
		GreensTech g=new GreensTech();
		g.greensOmr(1000);
		g.greensOmr("GreensTechology");
		g.greensOmr("xxxxx", 7);
		g.greensOmr("xxxx", 7);
		g.greensOmr(7, "yyyyyyyyy", "1656230165");
	}

}
