package day2.inheritancereworked;

public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Insurance insurance = new Insurance(1,"Sarthak",21,10000);
		
		double premium= insurance.calculatePremium();
				
		System.out.println("The Premium Amount is \n "+ premium);
		
		VehicleInsurance vehicle = new VehicleInsurance(1,"sarthak",21,100000,4,2020,100000);
		
		double cost=vehicle.calculatePremium();
		
		System.out.println("The total cost of the vehicle is \n"+ cost);
		
	}

}
