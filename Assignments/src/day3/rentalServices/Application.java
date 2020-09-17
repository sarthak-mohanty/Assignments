package day3.rentalServices;

import java.util.Scanner;

import day3.polymorphism.ifaces.RentalAgency;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double total=0;
		Agency rlrents=new Agency();
		
		int ch=99;
		System.out.println("Enter the Values between 1.Computers \n 2.furniture \n and enter 0 to exit ");
		Scanner sc = new Scanner(System.in);
		do {
	    ch = sc.nextInt();
	    
		RentalAgency selected= rlrents.getProduct(ch);
		if( selected!=null) {
			total = total + rlrents.Total(selected);
			System.out.println("The Total is :" +total);
			System.out.println("if you want to add more items press enter or to exit press 0");
		}else if(ch==0){
			System.out.println("System Exited");
			break;
		}
		else {
			System.out.println("enter valid number between 1-3");
	    }
		}while(ch!=0);
		
		//System.out.println(total);
	}
}
