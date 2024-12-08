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

import project.conteneurisation.model.Note;
import project.conteneurisation.model.Note;
import project.conteneurisation.service.NoteService;


@RestController
@CrossOrigin
@RequestMapping("/api/notes")
public class NoteController {
     @Autowired
    private NoteService NoteService;

    @GetMapping
    public List<Note> getAllNotes() {
        return NoteService.getAllNotes();
    }
    @PostMapping
    public Note createNote(@RequestBody Note Note) {
        return NoteService.createNote(Note);
    }
    
}
