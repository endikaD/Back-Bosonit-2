package com.example.EjemploJPA.asignatura.repository;

import com.example.EjemploJPA.asignatura.domain.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer> {
}
