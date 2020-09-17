package day3.rentalServices;

import day3.polymorphism.ifaces.RentalAgency;

public class NewAgency extends Agency {

	@Override
	public RentalAgency getProduct(int key) {
		// TODO Auto-generated method stub
		if(key==3) {
			return new AirConditioner();
		}
		return super.getProduct(key);
	}

	

	
}
