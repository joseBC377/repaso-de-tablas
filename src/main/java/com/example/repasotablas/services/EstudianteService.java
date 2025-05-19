package com.example.repasotablas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.repasotablas.entities.Estudiante;
import com.example.repasotablas.repositories.EstudianteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EstudianteService {
    private EstudianteRepository repository;

    public List<Estudiante> selectEstudiante() {
        return repository.findAll();
    }

    public Estudiante selectEstudianteId(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado con id :" + id));
    }

    public Estudiante insertEstudiante(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    public Estudiante updateEstudiante(Integer id, Estudiante estudiante) {
        Estudiante estudianteExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado con id :" + id));
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setCurso(estudiante.getCurso());
        estudianteExistente.setDireccion(estudiante.getDireccion());
        return repository.save(estudianteExistente);
    }

    public void deleteEstudiante(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("No se puede eliminar Estudiante no encontrado");
        }
        repository.deleteById(id);
    }
}
