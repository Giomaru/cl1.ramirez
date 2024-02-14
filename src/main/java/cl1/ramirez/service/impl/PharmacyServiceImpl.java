package cl1.ramirez.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl1.ramirez.model.Pharmacy;
import cl1.ramirez.repo.PharmacyRepo;
import cl1.ramirez.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService {
	
	@Autowired
	PharmacyRepo pharmacyRepo; 
	
	@Override
	public List<Pharmacy> list() {
		
		return pharmacyRepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy r) {
		
		return pharmacyRepo.save(r);
	}

	@Override
	public Pharmacy update(Pharmacy r) {
		
		return pharmacyRepo.save(r);
	}

	@Override
	public void delete(int id) {
		
		pharmacyRepo.deleteById(id);
		
	}

}
