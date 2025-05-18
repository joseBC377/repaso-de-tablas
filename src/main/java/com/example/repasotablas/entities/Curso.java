package com.example.repasotablas.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 150)
    private String nombre;
    // Relacion muchos a muchos es una tabla intermedia se usa uando una entidad
    // puede estar relacionada con muchas otras y viceversa. 
    @ManyToMany
    @JoinTable(name = "curso-profesor",
     joinColumns = @JoinColumn(name = "curso_id"),
     inverseJoinColumns = @JoinColumn(name = "profesor_id"))
    private List<Profesor> profesor;
}
