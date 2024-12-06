package project.conteneurisation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.conteneurisation.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {}
