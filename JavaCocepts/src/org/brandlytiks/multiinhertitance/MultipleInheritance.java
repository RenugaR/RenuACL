package org.brandlytiks.multiinhertitance;

public class MultipleInheritance implements CarFeatures , CarTypes{

	@Override
	public void BMW() {
		
		System.out.println("BMW");
	}

	@Override
	public void Toyota() {
		
		System.out.println("Toyato");
	}

	@Override
	public void Benz() {
		System.out.println("Benz");
		
	}

	@Override
	public void Honda() {
		System.out.println("Honda");
		
	}

	@Override
	public void TotalPrize() {
		
		System.out.println("TotalPrize");
	}

	@Override
	public void color() {
		
		System.out.println("Color");
	}

	@Override
	public void size() {
		
		System.out.println("Size");
	}

	@Override
	public void price() {
		System.out.println("Price");
		
	}
	
public static void main(String[] args) {
	MultipleInheritance m=new MultipleInheritance();
	m.Benz();
	m.BMW();
	m.Honda();
	m.TotalPrize();
	m.color();
	m.size();
	m.price();
	
}
}
