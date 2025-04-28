package com.pdl.dossiermedicale.services;

import com.pdl.dossiermedicale.entites.Infirmier;
import com.pdl.dossiermedicale.repositories.iInfirmierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InfirmierService {

    @Autowired
    private iInfirmierRepository infirmierRepository;

    public List<Infirmier> getAllInfirmiers() {
        return infirmierRepository.findAll();
    }

    public Optional<Infirmier> getInfirmierById(Long id) {
        return infirmierRepository.findById(id);
    }

    public Infirmier saveInfirmier(Infirmier infirmier) {
        return infirmierRepository.save(infirmier);
    }

    public void deleteInfirmier(Long id) {
        infirmierRepository.deleteById(id);
    }
}
