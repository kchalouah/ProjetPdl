package com.pdl.dossiermedicale.entites;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TechnicienMedicale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String domaine;
    private String telephone;
}