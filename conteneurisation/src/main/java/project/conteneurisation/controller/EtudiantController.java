package project.conteneurisation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.conteneurisation.model.Etudiant;
import project.conteneurisation.service.EtudiantService;

@RestController
@CrossOrigin
@RequestMapping("/api/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }
    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable int id) {
        return etudiantService.getEtudiantById(id);
    }


    @PostMapping
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }
    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable int id){
        etudiantService.deleteEtudiantById(id);

    }
   @PatchMapping("/{id}")
   public void updateEtudiant(@PathVariable int id,@RequestBody Etudiant etudiant){
        etudiantService.updateEtudiantById(id,etudiant);
}
}
