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

import com.example.repasotablas.entities.Profesor;
import com.example.repasotablas.services.ProfesorService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/profesor", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProfesorRestController {
    private ProfesorService service;

    @GetMapping(value = "select")
    public List<Profesor> selectProfesor() {
        return service.selectProfesor();
    }
    @GetMapping(value = "select/{id}") 
    public Profesor selectProfesorId(@PathVariable int id){
        return service.selectProfesorId(id);
    }
    @PostMapping(value = "insert")
    public Profesor insertProfesor(@RequestBody Profesor profesor){
        return service.insertProfesor(profesor);
    }
    @PutMapping(value = "update/{id}")
    public Profesor updateProfesor(@RequestBody Profesor profesor,@PathVariable int id){
        return service.updateProfesor(id, profesor);
    }
    @DeleteMapping(value = "delete/{id}")
    public void deleteProfesor(@PathVariable int id){
         service.deleteProfesor(id);
    }

}
