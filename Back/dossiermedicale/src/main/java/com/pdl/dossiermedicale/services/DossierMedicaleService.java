package com.pdl.dossiermedicale.services;

import com.pdl.dossiermedicale.entites.DossierMedicale;
import com.pdl.dossiermedicale.repositories.iDossierMedicaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DossierMedicaleService {

    @Autowired
    private iDossierMedicaleRepository DossierMedicaleRepository;

    public List<DossierMedicale> getAllDossiers() {
        return DossierMedicaleRepository.findAll();
    }

    public Optional<DossierMedicale> getDossierById(Long id) {
        return DossierMedicaleRepository.findById(id);
    }

    public DossierMedicale saveDossier(DossierMedicale dossierMedicale) {
        return DossierMedicaleRepository.save(dossierMedicale);
    }

    public void deleteDossier(Long id) {
        DossierMedicaleRepository.deleteById(id);
    }
}
