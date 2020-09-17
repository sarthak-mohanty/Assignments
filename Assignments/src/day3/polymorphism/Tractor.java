package day3.polymorphism;

import day3.polymorphism.ifaces.Automobile;

public class Tractor implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "New tractor";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1000000.00;
	}

}