package com.pdl.dossiermedicale.repositories;

import com.pdl.dossiermedicale.entites.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iDocumentRepository extends JpaRepository<Document, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}