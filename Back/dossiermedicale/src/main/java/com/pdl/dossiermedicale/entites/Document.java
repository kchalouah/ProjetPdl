package com.pdl.dossiermedicale.entites;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String description;

    @Lob
    private byte[] fichier;

    private Date dateAjout = new Date();

    @ManyToOne
    @JoinColumn(name = "dossier_id")
    private DossierMedicale dossierMedical;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getFichier() {
        return fichier;
    }

    public void setFichier(byte[] fichier) {
        this.fichier = fichier;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public DossierMedicale getDossierMedical() {
        return dossierMedical;
    }

    public void setDossierMedical(DossierMedicale dossierMedical) {
        this.dossierMedical = dossierMedical;
    }
}