package com.example.repasotablas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.repasotablas.entities.Curso;
import com.example.repasotablas.repositories.CursoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CursoService {
 private CursoRepository repository;
 public List<Curso> selectCurso(){
    return repository.findAll();
 }
 public Curso selectCursoId(Integer id){
    return repository.findById(id).orElseThrow(()-> new RuntimeException("Curso no encontrado con id :"+id));
 }
 public Curso insertCurso(Curso curso){
    return repository.save(curso);
 }
 public Curso updateCurso(Integer id, Curso curso){
    Curso cursoExistente = repository.findById(id).orElseThrow(()-> new RuntimeException("Curso no encontrado con id :"+ id));
    cursoExistente.setNombre(curso.getNombre());
    cursoExistente.setProfesor(curso.getProfesor());
    return repository.save(cursoExistente);
}
public void deleteCurso(Integer id){
    if (!repository.existsById(id)) {
        throw new RuntimeException("No se puede eliminar curso no encontrado");
    }
    repository.deleteById(id);
}
}
