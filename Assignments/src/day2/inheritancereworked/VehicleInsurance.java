package day2.inheritancereworked;

public class VehicleInsurance extends Insurance {

	private int vehicleModel;
	private int yearOfManufacture;
	private double costOfVehicle;
	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleInsurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount,int vehicleModel, int yearOfManufacture, double costOfVehicle) {
		super(policyNumber, policyHolderName, policyHolderAge, insuredAmount);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
		// TODO Auto-generated constructor stub
	}
	
	public int getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(int vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public double getCostOfVehicle() {
		return costOfVehicle;
	}
	public void setCostOfVehicle(double costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}
	
	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double costAmount=0.0;
		
		if(getVehicleModel()==2) {
			
			if(getYearOfManufacture() > 2018)
				costAmount = 0.5*this.getCostOfVehicle();
			else 
				costAmount = 0.6*this.getCostOfVehicle();
		}

			else if(getVehicleModel()==4) {
				
				if(getYearOfManufacture() > 2018)
					costAmount = 0.4*this.getCostOfVehicle();
				else
					costAmount = 0.5*this.getCostOfVehicle();
		}
		
		return costAmount;
	}
}