package day1.bloodDonorDetails;

public class BloodDonor {

	private String donorName;
	private int donorAge;
	private String donorBloodType;
	public BloodDonor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BloodDonor(String donorName, int donorAge, String donorBloodType) {
		super();
		this.donorName = donorName;
		this.donorAge = donorAge;
		this.donorBloodType = donorBloodType;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public int getDonorAge() {
		return donorAge;
	}
	public void setDonorAge(int donorAge) {
		this.donorAge = donorAge;
	}
	public String getDonorBloodType() {
		return donorBloodType;
	}
	public void setDonorBloodType(String donorBloodType) {
		this.donorBloodType = donorBloodType;
	}
	
}