package day7.collectionsExercise;

import day7.collectionsExercise.model.Doctor;
import day7.collectionsExercise.model.Patient;
import day7.collectionsExercise.services.AppointmentManager;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean flag=false;
		Patient patient1=new Patient(1,"Sarthak");
		Patient patient2=new Patient(2,"Sarthak1");
		Patient patient3=new Patient(3,"Sarthak2");
		Patient patient4=new Patient(4,"Sarthak3");
		Patient patient5=new Patient(5,"Sarthak4");
		
		Doctor doctor1=new Doctor(101,"ramesh");
		Doctor doctor2=new Doctor(102,"suresh");
		
		AppointmentManager manage= new AppointmentManager();
		
		flag=manage.makeAppointment(doctor1, patient1);
		manage.makeAppointment(doctor1, patient2);
		manage.makeAppointment(doctor2, patient3);
		manage.makeAppointment(doctor2, patient4);
		manage.makeAppointment(doctor1, patient5);
		if(flag==true) {
			System.out.println("patient added");
		}
		
		System.out.println(manage.getPatients("suresh"));
		
		manage.cancelAppointment(patient3);
		
		System.out.println(manage.getPatients("suresh"));
		
		
		
		
		
	}

}
