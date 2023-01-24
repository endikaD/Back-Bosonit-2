package com.example.EjemploJPA.application;

import com.example.EjemploJPA.controller.dto.PersonaInputDto;
import com.example.EjemploJPA.controller.dto.PersonaOutputDto;
import com.example.EjemploJPA.domain.Persona;
import com.example.EjemploJPA.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public PersonaOutputDto añadirPersona(PersonaInputDto personaInputDto){
        if (personaRepository.findByUsuario(personaInputDto.getUsuario()) == null) {
            Persona persona = personaInputDtoToEntity(personaInputDto);
            persona.setId(persona.getId());
            personaRepository.save(persona);

            PersonaOutputDto personaOutputDto = new PersonaOutputDto(persona);
            return personaOutputDto;
        }
        System.out.println("Este nombre de usuario ya está cogido");
        return null;
    }

    @Override
    public PersonaOutputDto obtenerPersonaPorUsuario(String usuario) {
        Persona persona = personaRepository.findByUsuario(usuario);
        return new PersonaOutputDto(persona);
    }

    @Override
    public PersonaOutputDto obtenerPersonaPorId(Integer id) {
        Persona persona = personaRepository.findById(id).orElseThrow();
        return new PersonaOutputDto(persona);
    }

    @Override
    public Iterable<PersonaOutputDto> obtenerPersonas(int numPag, int tamPag) {
        return null;
    }

    public Persona personaInputDtoToEntity(PersonaInputDto personaInputDto) {
        Persona persona = new Persona();
        persona.setId(personaInputDto.getId());
        persona.setUsuario(personaInputDto.getUsuario());
        persona.setContraseña(personaInputDto.getContraseña());
        persona.setNombre(personaInputDto.getNombre());
        persona.setApellido(personaInputDto.getApellido());
        persona.setEmailCompañia(personaInputDto.getEmailCompañia());
        persona.setEmailPersonal(personaInputDto.getEmailCompañia());
        persona.setCity(personaInputDto.getCity());
        persona.setActivo(personaInputDto.isActivo());
        persona.setFechaCreacion(personaInputDto.getFechaCreacion());
        persona.setUrlImagen(personaInputDto.getUrlImagen());
        persona.setFechaFinalizacion(personaInputDto.getFechaFinalizacion());

        return persona;
    }
}
