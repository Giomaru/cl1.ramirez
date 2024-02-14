package cl1.ramirez.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import cl1.ramirez.model.Prescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer> {

}
