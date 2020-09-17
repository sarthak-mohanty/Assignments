package day3.polymorphism;

import java.util.Scanner;

import day3.polymorphism.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowRoom saiCars=new NewShowRoom();
		
		//int key= Integer.parseInt(args[0]);
		int ch=99;
		System.out.println("Enter the Values between 1-3 \n and enter 0 to exit ");
		Scanner sc = new Scanner(System.in);
		do {
	    ch = sc.nextInt();
	    
		Automobile selected= saiCars.getProduct(ch);
		if( selected!=null) {
		saiCars.printEstimate(selected);
		}else if(ch==0){
			System.out.println("System Exited");
			break;
		}
		else {
			System.out.println("enter valid number between 1-3");
	    }
		}while(ch!=0);
		
	}

}
