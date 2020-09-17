package day3.polymorphism;

import day3.polymorphism.ifaces.Automobile;

public class ShowRoom {

	
	//Factory method - based on the Key Passed
	//Returns the Object of Type Automobile
	public Automobile getProduct(int key) {
		
		switch (key) {
		case 1:
			return new Bike();
		case 2:
			return new Car();
		default:
			return null;
		}
		
	}
	
	public void printEstimate(Automobile polyAuto) {
		
		System.out.println(polyAuto.APPNAME);
		
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
		
	}
}
