package day2.inheritancereworked;

public class Insurance {
	private int policyNumber;
	private String policyHolderName;
	private int policyHolderAge;
	private double insuredAmount;
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyHolderAge = policyHolderAge;
		this.insuredAmount = insuredAmount;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public int getpolicyHolderAge() {
		return policyHolderAge;
	}
	public void setpolicyHolderAge(int policyHolderAge) {
		this.policyHolderAge = policyHolderAge;
	}
	public double getInsuredAmount() {
		return insuredAmount;
	}
	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	
	public double calculatePremium() {
		double premium;
		
		if( getpolicyHolderAge()< 25)
		{
			premium= 0.6 * this.getInsuredAmount();
		}
		else {
			premium= 0.7 * this.getInsuredAmount();
		}
		return premium;
	}

}
