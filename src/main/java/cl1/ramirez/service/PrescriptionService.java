package cl1.ramirez.service;

import java.util.List;

import cl1.ramirez.model.Prescription;

public interface PrescriptionService {
	
	public List<Prescription> list();
	public Prescription add (Prescription c);
	public Prescription update (Prescription c);
	public void delete (int id);

}
