package day3.rentalServices;

import day3.polymorphism.ifaces.Automobile;
import day3.polymorphism.ifaces.RentalAgency;

public class Agency {

public RentalAgency getProduct(int key) {
		
		switch (key) {
		case 1:
			return new Computers();
		case 2:
			return new Furniture();
		default:
			return null;
		}
		
	}

public double Total(RentalAgency polyAuto, int items , int days) {
	
	double total = polyAuto.getItemPrice(items) * polyAuto.getRentDays(days);
	
	return total;
	
	
}
}
