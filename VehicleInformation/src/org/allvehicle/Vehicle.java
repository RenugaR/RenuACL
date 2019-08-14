package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {

	public void vehicleNecessery() {
		System.out.println("VehicleNecessary : Yes");

	}

	public static void main(String[] args) {
	Vehicle v=new Vehicle();
		v.vehicleNecessery();
	TwoWheller t=new TwoWheller();
		t.bike();
		t.cycle();
	ThreeWheeler th=new ThreeWheeler();
		th.Auto();
	FourWheeler f=new FourWheeler();
		f.bus();
		f.car();
		f.lorry();
	}

}
