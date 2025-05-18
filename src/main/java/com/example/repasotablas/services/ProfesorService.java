package com.example.repasotablas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.repasotablas.entities.Profesor;
import com.example.repasotablas.repositories.ProfesorRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProfesorService {
    private ProfesorRepository repository;

    public List<Profesor> selectProfesor() {
        return repository.findAll();
    }

    public Profesor selectProfesorId(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado con id :" + id));
    }

    public Profesor insertProfesor(Profesor profesor) {
        return repository.save(profesor);
    }

    public Profesor updateProfesor(Integer id, Profesor profesor) {
        Profesor profesorExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado con id :" + id));
        profesorExistente.setNombre(profesor.getNombre());;
        return repository.save(profesorExistente);
    }

    public void deleteProfesor(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("No se puede eliminar Profesor no encontrado");
        }
        repository.deleteById(id);
    }
}
