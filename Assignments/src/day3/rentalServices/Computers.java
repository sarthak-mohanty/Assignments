package day3.rentalServices;

import java.util.Scanner;

import day3.polymorphism.ifaces.RentalAgency;

public class Computers implements RentalAgency {

	int item;
	double price;
	@Override
	public double getRentDays() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of days for rent");
		int days= sc.nextInt();
		return days;
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		Scanner ip= new Scanner(System.in);
		System.out.println("select the number for what to rent \n 1.Laptop \n 2. Gaming Computer");
	    item = ip.nextInt();
	    
		if (item==1) {
			price=1000000.00;			
		}else if (item==2) {
			price=2000000.00;
		}
		//doneS
		System.out.println(price);
		return price;
	}



}
