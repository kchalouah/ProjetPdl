package com.pdl.dossiermedicale.entites;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class DossierMedicale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String historique;
    private Date dateCreation = new Date();

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "medecin_id")
    private Medecin medecinAssigne;

    @ManyToOne
    @JoinColumn(name = "infirmier_id")
    private Infirmier infirmierAssigne;

    @ManyToOne
    @JoinColumn(name = "technicien_id")
    private TechnicienMedicale technicienAssigne;

    @OneToMany(mappedBy = "dossierMedical")
    private List<Document> documents;
}