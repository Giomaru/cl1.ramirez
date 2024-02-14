package cl1.ramirez.service;

import java.util.List;

import cl1.ramirez.model.Patient;


public interface PatientService {
	
	public List<Patient> list();
	public Patient add (Patient p);
	public Patient update (Patient p);
	public void delete (int id);

}
