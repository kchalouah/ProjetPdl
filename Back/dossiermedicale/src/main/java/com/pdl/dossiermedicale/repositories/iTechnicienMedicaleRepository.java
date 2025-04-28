package com.pdl.dossiermedicale.repositories;

import com.pdl.dossiermedicale.entites.TechnicienMedicale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iTechnicienMedicaleRepository extends JpaRepository<TechnicienMedicale, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
