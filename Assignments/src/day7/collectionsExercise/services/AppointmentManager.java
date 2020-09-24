package day7.collectionsExercise.services;

import java.util.*;

import day7.collectionsExercise.ifaces.HospitalDOA;
import day7.collectionsExercise.model.Doctor;
import day7.collectionsExercise.model.Patient;

public class AppointmentManager implements HospitalDOA {

	private Set<Patient> patientList=new HashSet<Patient>();
	private Map<Doctor,Set<Patient>> appointmentList= new HashMap<Doctor,Set<Patient>>();
	
	@Override
	public boolean makeAppointment(Doctor doctor, Patient patient){
		// To make an appointment for a patient to a specific doctor but if the doctor is new
		//still an appointment can be made
		boolean flag=false;
		if(doctor!=null) {
		if(appointmentList.containsKey(doctor)) {
			Set<Patient> patients=appointmentList.get(doctor);
			patients.add(patient);
			appointmentList.put(doctor, patients);
		}
		else {
			Set<Patient> patients = new HashSet<Patient>();
			patients.add(patient);
			appointmentList.put(doctor, patients);
		}
		
		flag=true;
		}
		return flag;
	}

	@Override
	public Set<Patient> getPatients(String doctorName) {
		// Gets list of patients from a specific doctor
		Set<Patient> patients = new HashSet<Patient>();
        Set<Map.Entry<Doctor, Set<Patient>>> set = appointmentList.entrySet();
		for(Map.Entry<Doctor, Set<Patient>> eachPatient: set) {
			Doctor doctor = eachPatient.getKey();
			if(doctor.getDoctorName().equalsIgnoreCase(doctorName)) {
				patients= eachPatient.getValue() ;
			}
		}
		return patients;
	}

	@Override
	public boolean cancelAppointment(Patient patient) {
		// cancels an appointment for a patient
		boolean flag=false;
		Set<Map.Entry<Doctor, Set<Patient>>> set = appointmentList.entrySet();
		for(Map.Entry<Doctor, Set<Patient>> eachPatient: set) {
			Set<Patient> patients = eachPatient.getValue();
			if(patients.contains(patient)) {
			       patients.remove(patient);
			       flag=true;
			}
		}
		return flag;
	}

}
