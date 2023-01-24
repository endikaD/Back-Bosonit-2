package com.example.EjemploJPA.repository;

import com.example.EjemploJPA.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    Persona findByEmailPersonal(String emailPersonal);

    Persona findByUsuario(String usuario);
}
