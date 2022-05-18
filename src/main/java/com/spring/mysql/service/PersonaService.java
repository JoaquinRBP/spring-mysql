package com.spring.mysql.service;

import com.spring.mysql.interfaceService.IPersonaService;
import com.spring.mysql.interfaces.IPersona;
import com.spring.mysql.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonaService implements IPersonaService {
    private IPersona iPersona;

    public PersonaService(IPersona iPersona) {
        this.iPersona = iPersona;
    }

    @Override
    public List<Persona> listar() {
        return (List<Persona>) iPersona.findAll();
    }

    @Override
    public Optional<Persona> listarId(Long id) {
        return Optional.empty();
    }

    @Override
    public Long save(Persona persona) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
