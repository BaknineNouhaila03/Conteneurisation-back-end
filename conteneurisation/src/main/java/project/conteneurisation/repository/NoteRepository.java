package project.conteneurisation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import project.conteneurisation.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {
    @Query("SELECT n FROM Note n WHERE n.etudiant.id= :studentId")
    List<Note> findByStudentId(@Param("studentId") int studentId);
}
