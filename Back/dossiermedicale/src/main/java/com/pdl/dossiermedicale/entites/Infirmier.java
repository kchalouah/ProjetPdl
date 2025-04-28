package com.pdl.dossiermedicale.entites;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Infirmier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String telephone;
    private String service;
}