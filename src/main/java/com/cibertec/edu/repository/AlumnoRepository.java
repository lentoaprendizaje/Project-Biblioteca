package com.cibertec.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.edu.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}
