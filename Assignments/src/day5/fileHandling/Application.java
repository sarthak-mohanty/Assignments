package day5.fileHandling;
import java.io.*;
import java.util.Scanner;

import day5.fileHandling.model.CreditCard;
import day5.fileHandling.services.*;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        CreditCard[] creditCard= new CreditCard[3];
        CreditCardService service= new CreditCardService();
        
        CreditCard card1= new CreditCard(11223344,"Sarthak Mohanty");
        card1.setCreditLimit(1234);
        CreditCard card2= new CreditCard(11223355,"Rajesh Kumar");
        card1.setCreditLimit(12345);
        CreditCard card3= new CreditCard(11223366,"Binod Binod");
        card1.setCreditLimit(12346);
        
        creditCard[0]= card1;
        creditCard[1]= card2;
        creditCard[2]= card3;
        
        boolean value1=service.storeChar(creditCard, new File("HelloChar.txt"),true);
        if(value1==true) {
        	System.out.println("done");
        }else {
        	System.out.println("not done");
        }
        
        boolean value2=service.storeByte(creditCard, new File("Hello.txt"));
        if(value2==true) {
        	System.out.println("done");
        }else {
        	System.out.println("not done");
        }
        
      System.out.println(service.retrieveChar(new File("HelloChar.txt"),11223366));
      service.deleteDataChar(new File("HelloChar.txt"),11223366);
      service.deleteDataByte(new File("Hello.txt"),11223366);
        
        	
       
	}

}
