package com.example.repasotablas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.repasotablas.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso,Integer> {
}
