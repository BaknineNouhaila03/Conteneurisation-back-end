package project.conteneurisation.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import project.conteneurisation.model.Etudiant;
import project.repository.EtudiantRepository;

@Service
@Transactional
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Etudiant updateEtudiant(Etudiant etudiant) {
        return entityManager.merge(etudiant);
    }
}
