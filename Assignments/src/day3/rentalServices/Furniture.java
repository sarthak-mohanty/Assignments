package day3.rentalServices;

import java.util.Scanner;

import day3.polymorphism.ifaces.RentalAgency;

public class Furniture implements RentalAgency {

	double price;
	@Override
	public double getRentDays(int days) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the number of days for rent");
//		int day= sc.nextInt();
		int day=days;
		return day;
	}

	@Override
	public double getItemPrice(int items) {
		// TODO Auto-generated method stub
//		Scanner ip= new Scanner(System.in);
//		System.out.println("select the number for what to rent \n 1.Dining table \n 2. Study Table");
//	    int item = ip.nextInt();
		
		int item= items;
	    
		
		if (item==1) {
			price=1000000.00;			
		}else if (item==2) {
			price=2000000.00;
		}
		return price;
	}



}
