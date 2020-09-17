package day2.inheritance;

public class InsuranceManager {
	
	public double calculatePremium(Insurance insurance) {
		
		double premium;
		if(insurance.getAge()<25) {
			 premium= 0.6 * insurance.getInsuredAmount();
		} else {
			 premium= 0.7 * insurance.getInsuredAmount();
		}
		
		return premium;
	}
	
}
