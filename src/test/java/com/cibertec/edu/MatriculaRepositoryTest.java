package com.cibertec.edu;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.cibertec.edu.repository.MatriculaRepository;
import com.cibertec.edu.entity.Alumno;
import com.cibertec.edu.entity.Matricula;
import com.cibertec.edu.repository.AlumnoRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class MatriculaRepositoryTest {
	
	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Autowired
	private AlumnoRepository alumnoRespository;
	
	@Test
	@Rollback(false)
	public void saveMatriucla() {
		Alumno alumno = new Alumno("Otto", "otto123@gmail.com");
		alumnoRespository.save(alumno);
		
		Matricula matricula = new Matricula("2025-Nobiembre", alumno);
		matriculaRepository.save(matricula);
	}
	
	@Test
	public void findAllMatricula() {
		List<Matricula> matriculaList = matriculaRepository.findAll();
		System.out.println("Matriculas: " + matriculaList);
	}
}
