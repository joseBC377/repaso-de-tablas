package com.example.repasotablas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.repasotablas.entities.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

}
