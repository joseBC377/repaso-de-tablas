package com.example.repasotablas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Estudiante {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(nullable = false,length = 150)
private String nombre;
//Relacion uno a uno Es útil cuando necesitas dividir información por razones de diseño, rendimiento, seguridad o modularidad. dividir datos opcionales o separar información sensible
@OneToOne
@JoinColumn(name ="direccion_id")
private Direccion direccion;
//Relación de muchos a uno
@ManyToOne
@JoinColumn(name = "curso_id")
private Curso curso;


}
