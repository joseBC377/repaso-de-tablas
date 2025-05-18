package com.example.repasotablas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.repasotablas.entities.Direccion;
import com.example.repasotablas.repositories.DireccionRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DireccionService {
    private DireccionRepository repository;

    public List<Direccion> selectDireccion() {
        return repository.findAll();
    }

    public Direccion selectDireccionId(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Direccion no encontrado con id :" + id));
    }

    public Direccion insertDireccion(Direccion direccion) {
        return repository.save(direccion);
    }

    public Direccion updateDireccion(Integer id, Direccion direccion) {
        Direccion direccionExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Direccion no encontrado con id :" + id));
        direccionExistente.setCalle(direccion.getCalle());
        direccionExistente.setCiudad(direccion.getCiudad());
        return repository.save(direccionExistente);
    }

    public void deleteDireccion(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("No se puede eliminar Direccion no encontrado");
        }
        repository.deleteById(id);
    }
}
