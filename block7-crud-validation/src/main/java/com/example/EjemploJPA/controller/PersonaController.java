package com.example.EjemploJPA.controller;

import com.example.EjemploJPA.application.PersonaServiceImpl;
import com.example.EjemploJPA.controller.dto.PersonaInputDto;
import com.example.EjemploJPA.controller.dto.PersonaOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    PersonaServiceImpl personaService;

    @PostMapping
    public PersonaOutputDto añadirPersona(@RequestBody PersonaInputDto personaInputDto) throws Exception {
        return personaService.añadirPersona(personaInputDto);
    }

    @GetMapping("/nombre/{usuario}")
    public PersonaOutputDto obtenerPersonaPorNombre(@PathVariable String usuario){
        return personaService.obtenerPersonaPorUsuario(usuario);
    }

    @GetMapping("/id/{id}")
    public PersonaOutputDto obtenerPersonaPorId(@PathVariable Integer id){
        return personaService.obtenerPersonaPorId(id);
    }
}
