package com.pdl.dossiermedicale.repositories;



import com.pdl.dossiermedicale.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iPatientRepository extends JpaRepository<Patient, Long> {
}
