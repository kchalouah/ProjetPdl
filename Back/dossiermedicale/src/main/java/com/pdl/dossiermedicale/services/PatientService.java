package com.pdl.dossiermedicale.services;

import com.pdl.dossiermedicale.entites.Patient;
import com.pdl.dossiermedicale.repositories.iPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private iPatientRepository ipatientRepository;

    public List<Patient> getAllPatients() {
        return ipatientRepository.findAll();
    }

    public Optional<Patient> getPatientById(Long id) {
        return ipatientRepository.findById(id);
    }

    public Patient savePatient(Patient patient) {
        return ipatientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        ipatientRepository.deleteById(id);
    }
}
