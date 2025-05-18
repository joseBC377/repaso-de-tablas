package com.example.repasotablas.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
    // puede estar relacionada con muchas otras y viceversa. para campos adicionales
    // se debe crear una nueva entidad para la tabla intermedia adentro muchos a uno
    // y para afuera uno a muchos conlos list y el mappedby
    @ManyToMany
    @JoinTable(name = "curso-profesor", joinColumns = @JoinColumn(name = "curso_id"), inverseJoinColumns = @JoinColumn(name = "profesor_id"))
    private List<Profesor> profesor;
    // se pone lista para no romper la relacion de muchos, wl orpharemoval indica que si quitas un estudiante de la lista tambien se borra de la base de datos
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Estudiante> estudiante;
}
