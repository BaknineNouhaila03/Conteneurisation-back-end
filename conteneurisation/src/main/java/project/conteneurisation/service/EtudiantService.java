package project.conteneurisation.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import project.conteneurisation.model.Etudiant;
import project.conteneurisation.repository.EtudiantRepository;

@Service
@Transactional
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Etudiant createEtudiant(String nom) {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom); 
        return etudiantRepository.save(etudiant);
    }
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
    public void deleteEtudiantById(int id) {
        if (etudiantRepository.existsById(id)) { 
            etudiantRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Etudiant with ID " + id + " does not exist.");
        }
    }

    
}
