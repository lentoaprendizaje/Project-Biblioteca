package com.cibertec.edu.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.edu.entity.Alumno;

public interface IAlumnoService {
	public List<Alumno> listarAlumno();
	public Alumno guardarAlumno(Alumno alumno);
	public Optional<Alumno> buscarAlumno(int codigo);
	public void eliminarAlumno(int codigo);
}
