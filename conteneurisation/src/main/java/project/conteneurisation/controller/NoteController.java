package project.conteneurisation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.conteneurisation.model.Note;
import project.conteneurisation.service.NoteService;

@RestController
@CrossOrigin(origins ="http://minikube.baknine.frontend.com")
@RequestMapping("/api/etudiants/{studentId}/notes")
public class NoteController {
    
    @Autowired
    private NoteService noteService;

    // Correct the method to filter notes by studentId
    @GetMapping
    public List<Note> getNotesForEtudiant(@PathVariable int studentId) {
        return noteService.getNotesForEtudiant(studentId); 
    }

    @PostMapping
    public ResponseEntity<Note> addNoteToStudent(@PathVariable int studentId,@RequestBody Note note) {
    Note createdNote = noteService.createNote(studentId,note);
    return ResponseEntity.ok(createdNote);
}
}
