package cl1.ramirez.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl1.ramirez.model.Prescription;
import cl1.ramirez.repo.PrescriptionRepo;
import cl1.ramirez.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {
	
	@Autowired
	PrescriptionRepo prescriptionRepo; 
	
	@Override
	public List<Prescription> list() {
		
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription c) {
		
		return prescriptionRepo.save(c);
	}

	@Override
	public Prescription update(Prescription c) {
		
		return prescriptionRepo.save(c);
	}

	@Override
	public void delete(int id) {
		
		prescriptionRepo.deleteById(id);
		
	}

}
