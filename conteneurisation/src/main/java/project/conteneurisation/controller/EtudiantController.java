package project.conteneurisation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.conteneurisation.model.Etudiant;
import project.conteneurisation.service.EtudiantService;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @PostMapping
    public Etudiant createEtudiant(@RequestBody String nom) {
        return etudiantService.createEtudiant(nom);
    }
    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable int id){
        etudiantService.deleteEtudiantById(id);

    }
}
