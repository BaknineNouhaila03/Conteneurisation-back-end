package project.conteneurisation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.conteneurisation.model.Note;
import project.conteneurisation.model.Etudiant;
import project.conteneurisation.repository.NoteRepository;
import project.conteneurisation.repository.EtudiantRepository;

@Service
@Transactional
public class NoteService {
   
    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private EtudiantRepository etudiantRepository; // Fixing the case sensitivity
    @Transactional
    public Note createNote(int etudiantId, Note note) {
        // Fetch the Etudiant by ID
        Optional<Etudiant> etudiantOptional = etudiantRepository.findById(etudiantId);
        if (etudiantOptional.isPresent()) {
            Etudiant etudiant = etudiantOptional.get();
            note.setEtudiant(etudiant); // Set the Etudiant object directly
            return noteRepository.save(note); // Save the note
        } else {
            throw new RuntimeException("Etudiant not found");
        }
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public List<Note> getNotesForEtudiant(int etudiantId) {
        return noteRepository.findByStudentId(etudiantId); // Fetch notes for a specific Etudiant
    }
}
