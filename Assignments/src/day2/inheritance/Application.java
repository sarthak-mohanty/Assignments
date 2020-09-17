package day2.inheritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Insurance user= new Insurance(102,"Sarthak",28,10000.00);
		InsuranceManager mgr= new InsuranceManager();
		
		double premium= mgr.calculatePremium(user);
		
		System.out.println("the premium is "+ premium);
	}

}
