package com.pdl.dossiermedicale.Controllers;

import com.pdl.dossiermedicale.entites.Document;
import com.pdl.dossiermedicale.services.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping
    public List<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @GetMapping("/{id}")
    public Optional<Document> getDocumentById(@PathVariable Long id) {
        return documentService.getDocumentById(id);
    }

    @PostMapping
    public Document createDocument(@RequestBody Document document) {
        return documentService.saveDocument(document);
    }

    @PutMapping("/{id}")
    public Document updateDocument(@PathVariable Long id, @RequestBody Document document) {
        document.setId(id);
        return documentService.saveDocument(document);
    }

    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable Long id) {
        documentService.deleteDocument(id);
    }
}
