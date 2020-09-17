package day2.inheritance;

public class VehicleInsurance extends Insurance {
	
	private String vehicleModel;
	private int yearOfManufacture;
	private double costOfVehicle;
	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleInsurance(int policyNumber, String policyHolderName, int age, double insuredAmount) {
		super(policyNumber, policyHolderName, age, insuredAmount);
		// TODO Auto-generated constructor stub
	}
	public VehicleInsurance(String vehicleModel, int yearOfManufacture, double costOfVehicle) {
		super();
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
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
	
	

}
