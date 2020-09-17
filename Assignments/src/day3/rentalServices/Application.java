package day3.rentalServices;

import java.util.Scanner;

import day3.polymorphism.ifaces.RentalAgency;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double total=0;
		Agency rlrents=new Agency();
		
		int ch=99;
		int item = 0;
		int i=0;
		String[] bill;
		bill= new String[10];
		
		Scanner sc = new Scanner(System.in);
		
		Scanner d= new Scanner(System.in);
		
		
		Scanner ip= new Scanner(System.in);
		
	    
		do {
			System.out.println("Enter the Values between 1.Computers \n 2.furniture \n and enter 0 to exit ");
	    ch = sc.nextInt();
	    if(ch==1) {
	    	System.out.println("select the number for what to rent \n 1.Laptop \n 2. Gaming Computer");
		    item = ip.nextInt();
	    }
	    if(ch==2) {
		System.out.println("select the number for what to rent \n 1.Dining table \n 2. Study Table");
            item = ip.nextInt();
	    }
	    if(ch==1 && item==1) {
	    	bill[i]= "laptop";
	    } else 
	    	if(ch==1 && item==2) {
	    	bill[i]= "Gaming laptop";
	    }else 
	    	if(ch==2 && item==1) {
	    	bill[i]= "Dining table";
	    } else 
	    	if(ch==2 && item==2) {
	    	bill[i]= "study table";
	    }
	    i++;
	    System.out.println("Enter the number of days for rent");
		int day= d.nextInt();
	
	    
	    
		RentalAgency selected= rlrents.getProduct(ch);
		if( selected!=null) {
			total = total + rlrents.Total(selected,item,day);
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
		
		for(int j=0; j<i; j++) {
			System.out.println("Item---------->" + bill[j]);
		}
		System.out.println("Total amount" + total);
		
		//System.out.println(total);
	}
}
