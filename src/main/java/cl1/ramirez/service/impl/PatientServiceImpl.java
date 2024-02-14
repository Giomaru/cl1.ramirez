package cl1.ramirez.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl1.ramirez.model.Patient;
import cl1.ramirez.repo.PatientRepo;
import cl1.ramirez.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepo patientRepo; 
	
	@Override
	public List<Patient> list() {
		
		return patientRepo.findAll();
	}

	@Override
	public Patient add(Patient p) {
		
		return patientRepo.save(p);
	}

	@Override
	public Patient update(Patient p) {
		
		return patientRepo.save(p);
	}

	@Override
	public void delete(int id) {
		
		patientRepo.deleteById(id);
		
	}

}
