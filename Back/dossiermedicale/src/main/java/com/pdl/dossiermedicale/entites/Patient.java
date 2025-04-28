package com.pdl.dossiermedicale.entites;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
    private String dateNaissance;

    @OneToMany(mappedBy = "patient")
    private List<DossierMedicale> dossiers;
}