package com.example.EjemploJPA.controller.dto;

import com.example.EjemploJPA.domain.Persona;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaOutputDto {
    private Integer id;
    private String usuario;
    private String nombre;
    private String apellido;
    private String emailCompañia;
    private String emailPersonal;
    private String city;
    private boolean activo;
    private Date fechaCreacion;
    private String urlImagen;
    private Date fechaFinalizacion;

    public PersonaOutputDto(Persona persona){
        setId(persona.getId());
        setUsuario(persona.getUsuario());
        setNombre(persona.getNombre());
        setApellido(persona.getApellido());
        setEmailCompañia(persona.getEmailCompañia());
        setEmailPersonal(persona.getEmailCompañia());
        setCity(persona.getCity());
        setActivo(persona.isActivo());
        setFechaCreacion(persona.getFechaCreacion());
        setUrlImagen(persona.getUrlImagen());
        setFechaFinalizacion(persona.getFechaFinalizacion());
    }
}
