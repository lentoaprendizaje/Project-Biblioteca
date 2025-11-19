package com.cibertec.edu.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_Alumno")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_Alumno")
	private int codigo;
	
	@Column(name = "nom_Alumno", nullable = false, length = 150)
	private String nombre;
	
	@Column(name = "ema_Alumno", unique = true)
	private String correo;
	
	@OneToMany
	@JoinColumn(
    		name = "cod_Alumno",
    		referencedColumnName = "cod_Alumno"
    )
	private List<Curso> cursoList;
	
	public Alumno() { }

	public Alumno(String nombre, String correo) {		
		this.nombre = nombre;
		this.correo = correo;
	}
	
	public Alumno(int codigo, String nombre, String correo) {		
		this.codigo = codigo;
		this.nombre = nombre;
		this.correo = correo;
	} 

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
