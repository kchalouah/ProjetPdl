package com.pdl.dossiermedicale.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHistorique() {
        return historique;
    }

    public void setHistorique(String historique) {
        this.historique = historique;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Medecin getMedecinAssigne() {
        return medecinAssigne;
    }

    public void setMedecinAssigne(Medecin medecinAssigne) {
        this.medecinAssigne = medecinAssigne;
    }

    public Infirmier getInfirmierAssigne() {
        return infirmierAssigne;
    }

    public void setInfirmierAssigne(Infirmier infirmierAssigne) {
        this.infirmierAssigne = infirmierAssigne;
    }

    public TechnicienMedicale getTechnicienAssigne() {
        return technicienAssigne;
    }

    public void setTechnicienAssigne(TechnicienMedicale technicienAssigne) {
        this.technicienAssigne = technicienAssigne;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}