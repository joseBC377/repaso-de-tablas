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

import com.example.repasotablas.entities.Curso;
import com.example.repasotablas.services.CursoService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/curso", produces = MediaType.APPLICATION_JSON_VALUE)
public class CursoRestController {
    private CursoService service;

    @GetMapping(value = "select")
    public List<Curso> selectCurso() {
        return service.selectCurso();
    }

    @GetMapping(value = "select/{id}")
    public Curso selectCursoId(@PathVariable int id) {
        return service.selectCursoId(id);
    }

    @PostMapping(value = "insert/")
    public Curso insertCurso(@RequestBody Curso curso) {
        return service.insertCurso(curso);
    }

    @PutMapping(value = "update/{id}")
    public Curso updateCurso(@RequestBody Curso curso, @PathVariable int id) {
        return service.updateCurso(id, curso);
    }

    @DeleteMapping(value = "delete/{id}")
    public void deleteCurso(@PathVariable int id) {
        service.deleteCurso(id);
    }
}
