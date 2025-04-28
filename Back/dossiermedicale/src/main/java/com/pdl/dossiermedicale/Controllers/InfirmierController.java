package com.pdl.dossiermedicale.Controllers;

import com.pdl.dossiermedicale.entites.Infirmier;
import com.pdl.dossiermedicale.services.InfirmierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/infirmiers")
public class InfirmierController {

    @Autowired
    private InfirmierService infirmierService;

    @GetMapping
    public List<Infirmier> getAllInfirmiers() {
        return infirmierService.getAllInfirmiers();
    }

    @GetMapping("/{id}")
    public Optional<Infirmier> getInfirmierById(@PathVariable Long id) {
        return infirmierService.getInfirmierById(id);
    }

    @PostMapping
    public Infirmier createInfirmier(@RequestBody Infirmier infirmier) {
        return infirmierService.saveInfirmier(infirmier);
    }

    @PutMapping("/{id}")
    public Infirmier updateInfirmier(@PathVariable Long id, @RequestBody Infirmier infirmier) {
        infirmier.setId(id);
        return infirmierService.saveInfirmier(infirmier);
    }

    @DeleteMapping("/{id}")
    public void deleteInfirmier(@PathVariable Long id) {
        infirmierService.deleteInfirmier(id);
    }
}
