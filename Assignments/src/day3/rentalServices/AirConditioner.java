package day3.rentalServices;

import day3.polymorphism.ifaces.RentalAgency;

public class AirConditioner implements RentalAgency {

	int item;
	double price;
	@Override
	public double getRentDays(int days) {
		// TODO Auto-generated method stub
		int day=days;
		return day;
	}

	@Override
	public double getItemPrice(int items) {
		// TODO Auto-generated method stub
		item=items;
		if (item==1) {
			price=1000000.00;			
		}else if (item==2) {
			price=2000000.00;
		}
		return price;
	}

}
