package com.pdl.dossiermedicale.Controllers;

import com.pdl.dossiermedicale.entites.Patient;
import com.pdl.dossiermedicale.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    // Récupérer tous les patients
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    // Récupérer un patient par son identifiant
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id).orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    // Créer un nouveau patient
    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    // Mettre à jour un patient
    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        patient.setId(id);
        return patientService.savePatient(patient);
    }

    // Supprimer un patient
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
    }
}
