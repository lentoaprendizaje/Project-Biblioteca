package com.cibertec.edu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.entity.Alumno;
import com.cibertec.edu.repository.AlumnoRepository;

@Service
public class AlumnoServiceImplement implements IAlumnoService{

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public List<Alumno> listarAlumno() {
		alumnoRepository.findAll();
		return null;
	}

	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Alumno> buscarAlumno(int codigo) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void eliminarAlumno(int codigo) {
		// TODO Auto-generated method stub
		
	}
	
}
