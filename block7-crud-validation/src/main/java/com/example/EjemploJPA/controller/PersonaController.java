package com.example.EjemploJPA.controller;

import com.example.EjemploJPA.application.PersonaService;
import com.example.EjemploJPA.application.PersonaServiceImpl;
import com.example.EjemploJPA.controller.dto.PersonaInputDto;
import com.example.EjemploJPA.controller.dto.PersonaOutputDto;
import com.example.EjemploJPA.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

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
    public PersonaOutputDto obtenerPersonaPorId(@PathVariable Integer id) throws EntityNotFoundException {
        return personaService.obtenerPersonaPorId(id);
    }

    @GetMapping("/personas")
    public List<PersonaOutputDto> obtenerListaPersonas(){
        return personaService.obtenerPersonas();
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarPersona(@PathVariable Integer id) throws Exception {
        personaService.borrarPersona(id);
    }
    @PutMapping("/actualizar/{id}")
    public PersonaOutputDto actualizarPersona(@PathVariable Integer id, @RequestBody PersonaInputDto personaInputDto) throws Exception {
        return personaService.actualizarPersona(id, personaInputDto);
    }

}
