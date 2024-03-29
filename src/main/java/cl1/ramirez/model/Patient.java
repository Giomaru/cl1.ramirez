package cl1.ramirez.model;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	
	private String patient_FName;
	private String patient_LName;
	private String patient_Address;
	private String patient_Phone_Number;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pharmacy_id", referencedColumnName= "pharmacyId")
	private Pharmacy pharmacy;

}
