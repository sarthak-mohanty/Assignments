package day1.bloodDonorDetails;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BloodDonor user = new BloodDonor();
		
		user.setDonorName("Sarthak");
		user.setDonorAge(21);
		user.setDonorBloodType("o +ve");
		
		System.out.println(user.getDonorName());
		System.out.println(user.getDonorAge());
		System.out.println(user.getDonorBloodType());
	}

}
