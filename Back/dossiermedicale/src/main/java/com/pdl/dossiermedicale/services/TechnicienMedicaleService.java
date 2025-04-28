package com.pdl.dossiermedicale.services;

import com.pdl.dossiermedicale.entites.TechnicienMedicale;
import com.pdl.dossiermedicale.repositories.iTechnicienMedicaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TechnicienMedicaleService {

    @Autowired
    private iTechnicienMedicaleRepository technicienMedicaleRepository;

    public List<TechnicienMedicale> getAllTechniciens() {
        return technicienMedicaleRepository.findAll();
    }

    public Optional<TechnicienMedicale> getTechnicienById(Long id) {
        return technicienMedicaleRepository.findById(id);
    }

    public TechnicienMedicale saveTechnicien(TechnicienMedicale technicienMedicale) {
        return technicienMedicaleRepository.save(technicienMedicale);
    }

    public void deleteTechnicien(Long id) {
        technicienMedicaleRepository.deleteById(id);
    }
}
