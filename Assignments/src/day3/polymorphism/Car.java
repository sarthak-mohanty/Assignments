package day3.polymorphism;

import day3.polymorphism.ifaces.Automobile;

public class Car implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Toyoto ALTIS";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 800000.00;
	}

}
