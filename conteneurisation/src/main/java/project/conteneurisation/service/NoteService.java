package project.conteneurisation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import project.conteneurisation.model.Note;
import project.conteneurisation.model.Note;
import project.conteneurisation.repository.NoteRepository;
import project.conteneurisation.repository.NoteRepository;


@Service
@Transactional
public class NoteService {
   
    @Autowired
    private NoteRepository noteRepository;

    @PersistenceContext
    private EntityManager entityManager;
     public Note createNote(Note note ) {
        return noteRepository.save(note);
    }
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

}
