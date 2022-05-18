package com.spring.mysql.controller;

import com.spring.mysql.model.Persona;
import com.spring.mysql.service.PersonaService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    private PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/listar")
    public List<Persona> getList(Model model){
        List<Persona> personas=personaService.listar();
        /*model.addAttribute("personas",personas);
        return "index";*/
        return personas;
    }
}
