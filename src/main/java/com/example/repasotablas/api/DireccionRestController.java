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

import com.example.repasotablas.entities.Direccion;
import com.example.repasotablas.services.DireccionService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/direccion", produces = MediaType.APPLICATION_JSON_VALUE)
public class DireccionRestController {
    private DireccionService service;

    @GetMapping(value = "select")
    public List<Direccion> selectDireccion() {
        return service.selectDireccion();
    }

    @GetMapping(value = "select/{id}")
    public Direccion selectDireccionId(@PathVariable int id) {
        return service.selectDireccionId(id);
    }

    @PostMapping(value = "insert")
    public Direccion insertDireccion(@RequestBody Direccion direccion) {
        return service.insertDireccion(direccion);
    }

    @PutMapping(value = "update/{id}")
    public Direccion updateDireccion(@RequestBody Direccion direccion, @PathVariable int id) {
        return service.updateDireccion(id, direccion);
    }

    @DeleteMapping(value = "delete/{id}")
    public void deleteDireccion(@PathVariable int id) {
        service.deleteDireccion(id);
    }

}
