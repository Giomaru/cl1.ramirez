package cl1.ramirez.service;

import java.util.List;

import cl1.ramirez.model.Pharmacy;

public interface PharmacyService {

	public List<Pharmacy> list();
	public Pharmacy add (Pharmacy r);
	public Pharmacy update (Pharmacy r);
	public void delete (int id);
}
