package com.spring.mysql.interfaceService;

import com.spring.mysql.model.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public List<Persona> listar();
    public Optional<Persona> listarId(Long id);
    public Long save(Persona persona);
    public void delete(Long id);
}
