package cl1.ramirez.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import cl1.ramirez.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
