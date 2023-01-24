package com.example.EjemploJPA.domain;

import com.example.EjemploJPA.controller.dto.PersonaInputDto;
import com.example.EjemploJPA.controller.dto.PersonaOutputDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Persona")
public class Persona {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "usuario", nullable = false, length = 10)
    private String usuario;

    @Column(name = "contraseña", nullable = false)
    private String contraseña;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "emailCompañia", nullable = false)
    private String emailCompañia;

    @Column(name = "emailPersonal", nullable = false)
    private String emailPersonal;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "activo", nullable = false)
    private boolean activo;

    @Column(name = "fechaCreacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "urlImagen")
    private String urlImagen;

    @Column(name = "fechaFinalizacion")
    private Date fechaFinalizacion;


    public Persona(PersonaInputDto personaInputDto) {
        this.id = personaInputDto.getId();
        this.usuario = personaInputDto.getUsuario();
        this.contraseña = personaInputDto.getContraseña();
        this.nombre = personaInputDto.getNombre();
        this.apellido = personaInputDto.getApellido();
        this.emailCompañia = personaInputDto.getEmailCompañia();
        this.emailPersonal = personaInputDto.getEmailPersonal();
        this.city = personaInputDto.getCity();
        this.activo = personaInputDto.isActivo();
        this.fechaCreacion = personaInputDto.getFechaCreacion();
        this.urlImagen = personaInputDto.getUrlImagen();
        this.fechaFinalizacion = personaInputDto.getFechaFinalizacion();
    }
    /*
    public PersonaOutputDto personaToPersonaOutputDto() {
        return new PersonaOutputDto(
                this.id,
                this.usuario,
                this.nombre,
                this.apellido,
                this.emailCompañia,
                this.emailPersonal,
                this.city,
                this.activo,
                this.fechaCreacion,
                this.urlImagen,
                this.fechaFinalizacion
        );
    }

 */
}
