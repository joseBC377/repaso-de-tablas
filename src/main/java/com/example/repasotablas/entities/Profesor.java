package com.example.repasotablas.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
