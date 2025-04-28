package com.pdl.dossiermedicale.entites;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
@Entity
@Data
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
}