package com.example.EjemploJPA.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaInputDto {
    int id;
    String nombre;
    String poblacion;
    int edad;
}
