package com.pdl.dossiermedicale.Controllers;

import com.pdl.dossiermedicale.entites.DossierMedicale;
import com.pdl.dossiermedicale.services.DossierMedicaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dossiers")
public class DossierMedicaleController {

    @Autowired
    private DossierMedicaleService dossierMedicaleService;

    @GetMapping
    public List<DossierMedicale> getAllDossiers() {
        return dossierMedicaleService.getAllDossiers();
    }

    @GetMapping("/{id}")
    public Optional<DossierMedicale> getDossierById(@PathVariable Long id) {
        return dossierMedicaleService.getDossierById(id);
    }

    @PostMapping
    public DossierMedicale createDossier(@RequestBody DossierMedicale dossierMedicale) {
        return dossierMedicaleService.saveDossier(dossierMedicale);
    }

    @PutMapping("/{id}")
    public DossierMedicale updateDossier(@PathVariable Long id, @RequestBody DossierMedicale dossierMedicale) {
        dossierMedicale.setId(id);
        return dossierMedicaleService.saveDossier(dossierMedicale);
    }

    @DeleteMapping("/{id}")
    public void deleteDossier(@PathVariable Long id) {
        dossierMedicaleService.deleteDossier(id);
    }
}
