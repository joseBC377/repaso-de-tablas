package com.example.repasotablas.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Profesor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nombre;
@ManyToMany(mappedBy = "profesor")
private List<Curso> curso;
}
