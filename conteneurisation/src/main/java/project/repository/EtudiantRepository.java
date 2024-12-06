package project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import project.conteneurisation.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {}

