package project.conteneurisation.model;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @Column(name = "date_creation", updatable = false, nullable = false)
    @CreationTimestamp
    private LocalDateTime dateCreation;

    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private List<Note> notes;
}

