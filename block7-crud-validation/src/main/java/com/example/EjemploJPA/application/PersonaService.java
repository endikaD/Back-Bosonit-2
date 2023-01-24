package com.example.EjemploJPA.application;

import com.example.EjemploJPA.controller.dto.PersonaInputDto;
import com.example.EjemploJPA.controller.dto.PersonaOutputDto;
import com.example.EjemploJPA.exceptions.EntityNotFoundException;

import java.util.List;

public interface PersonaService {
    PersonaOutputDto añadirPersona(PersonaInputDto personaInputDto) throws EntityNotFoundException;

    PersonaOutputDto obtenerPersonaPorUsuario(String usuario);

    PersonaOutputDto obtenerPersonaPorId(Integer id) throws EntityNotFoundException;

    List<PersonaOutputDto> obtenerPersonas();

    PersonaOutputDto actualizarPersona(Integer id, PersonaInputDto personaInputDto) throws Exception;
    void borrarPersona(Integer id) throws Exception;
}
