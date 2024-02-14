package cl1.ramirez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl1.ramirez.model.Pharmacy;
import cl1.ramirez.service.PharmacyService;


@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {
	
	@Autowired
	PharmacyService pharmacyService;

	@GetMapping
	public ResponseEntity<List<Pharmacy>> list(){
		return new ResponseEntity<> (pharmacyService.list(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Pharmacy> add(@RequestBody Pharmacy r) {
		return new ResponseEntity<> (pharmacyService.add(r), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Pharmacy> update(@RequestBody Pharmacy r) {
		return new ResponseEntity<> (pharmacyService.update(r), HttpStatus.CREATED);
	}
	
	@DeleteMapping ("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		pharmacyService.delete(id);
		return new ResponseEntity<> (HttpStatus.OK);
	}

}
