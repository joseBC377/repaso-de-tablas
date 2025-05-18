package com.example.repasotablas.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Direccion {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(nullable = false,length = 150)
private String calle;
@Column(nullable = false, length = 150)
private String ciudad;
//forma parte de la relació uno a uno, mappedby le dice que el dueño es dirección y cascada Permite que operaciones en una entidad afecten a otra automáticamente

@OneToOne(mappedBy ="direccion", cascade = CascadeType.ALL)
private Estudiante estudiante;

}
