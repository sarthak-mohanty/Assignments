package day7.collectionsExercise.ifaces;
import java.util.*;
import day7.collectionsExercise.model.Doctor;
import day7.collectionsExercise.model.Patient;

public interface HospitalDOA {
	// To make a new appointment
	public boolean makeAppointment(Doctor doctor,Patient patient);
	//To return all the patients for a doctor
	public Set<Patient> getPatients(String doctorName);
	//To cancel a patients appointment
	public boolean cancelAppointment(Patient patient);

}
