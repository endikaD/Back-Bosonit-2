package com.example.EjemploJPA.application;

import com.example.EjemploJPA.controller.dto.PersonaInputDto;
import com.example.EjemploJPA.controller.dto.PersonaOutputDto;

public interface PersonaService {
    PersonaOutputDto añadirPersona(PersonaInputDto personaInputDto);

    PersonaOutputDto obtenerPersonaPorUsuario(String usuario);

    PersonaOutputDto obtenerPersonaPorId(Integer id);

    Iterable<PersonaOutputDto> obtenerPersonas(int numPag, int tamPag);
}
