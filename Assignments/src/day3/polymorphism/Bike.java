package day3.polymorphism;

import day3.polymorphism.ifaces.Automobile;

public class Bike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Pulsar";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 105000;
	}

}
