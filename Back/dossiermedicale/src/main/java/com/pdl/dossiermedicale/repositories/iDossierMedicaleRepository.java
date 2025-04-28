package com.pdl.dossiermedicale.repositories;

import com.pdl.dossiermedicale.entites.DossierMedicale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iDossierMedicaleRepository extends JpaRepository<DossierMedicale, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
