package com.pdl.dossiermedicale.Controllers;

import com.pdl.dossiermedicale.entites.TechnicienMedicale;
import com.pdl.dossiermedicale.services.TechnicienMedicaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/techniciens")
public class TechnicienMedicaleController {

    @Autowired
    private TechnicienMedicaleService technicienMedicaleService;

    @GetMapping
    public List<TechnicienMedicale> getAllTechniciens() {
        return technicienMedicaleService.getAllTechniciens();
    }

    @GetMapping("/{id}")
    public Optional<TechnicienMedicale> getTechnicienById(@PathVariable Long id) {
        return technicienMedicaleService.getTechnicienById(id);
    }

    @PostMapping
    public TechnicienMedicale createTechnicien(@RequestBody TechnicienMedicale technicienMedicale) {
        return technicienMedicaleService.saveTechnicien(technicienMedicale);
    }

    @PutMapping("/{id}")
    public TechnicienMedicale updateTechnicien(@PathVariable Long id, @RequestBody TechnicienMedicale technicienMedicale) {
        technicienMedicale.setId(id);
        return technicienMedicaleService.saveTechnicien(technicienMedicale);
    }

    @DeleteMapping("/{id}")
    public void deleteTechnicien(@PathVariable Long id) {
        technicienMedicaleService.deleteTechnicien(id);
    }
}
