package org.bank;

public class RBC {
		public void rbcRank() {
			System.out.println("Total of SBI,Canara and HDFC");
		}
	public static void main(String[] args) {
			HDCFC h=new HDCFC();
			SBI s=new SBI();
			Canara c=new Canara();
			h.rbcRank();
			s.rbcRank();
			c.rbcRank();
	}

}
