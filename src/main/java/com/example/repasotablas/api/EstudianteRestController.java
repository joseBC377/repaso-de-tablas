package com.example.repasotablas.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repasotablas.entities.Estudiante;
import com.example.repasotablas.services.EstudianteService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/estudiante", produces = MediaType.APPLICATION_JSON_VALUE)
public class EstudianteRestController {
private EstudianteService service;
@GetMapping(value = "select")
public List<Estudiante> selectEstudiante(){
    return service.selectEstudiante();
}
@GetMapping(value = "select/{id}")
public Estudiante selecEstudianteId(@PathVariable int id){
    return service.selectEstudianteId(id);
}
@PostMapping(value = "insert/")
public Estudiante insertEstudiante(@RequestBody Estudiante estudiante){
    return service.insertEstudiante(estudiante);
}
@PutMapping(value = "update/{id}")
public Estudiante updateEstudiante(@RequestBody Estudiante estudiante,@PathVariable int id){
    return service.updateEstudiante(id, estudiante);
}
@DeleteMapping(value = "delete/{id}")
public void deleteEstudiante(@PathVariable int id){
  service.deleteEstudiante(id);
}
}
