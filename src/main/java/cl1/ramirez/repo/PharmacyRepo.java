package cl1.ramirez.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl1.ramirez.model.Pharmacy;


public interface PharmacyRepo extends JpaRepository<Pharmacy, Integer> {

}
