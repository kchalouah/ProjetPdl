package com.pdl.dossiermedicale.repositories;

import com.pdl.dossiermedicale.entites.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iMedecinRepository extends JpaRepository<Medecin, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
