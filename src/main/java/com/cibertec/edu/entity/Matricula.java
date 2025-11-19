package com.cibertec.edu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

@Entity
@Table(name = "tbl_Matricula")
public class Matricula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_Matricula")
    private int codigo;
    
    @Column(name = "per_Matricula", nullable = false, length = 100)
    private String periodo;
    
    @OneToOne(
    		cascade = CascadeType.PERSIST
    )
    
    @JoinColumn(
    		name = "cod_Alumno",
    		referencedColumnName = "cod_Alumno"
    )
    private Alumno alumno;
    
    public Matricula() { }

	public Matricula(String periodo, Alumno alumno) {			
		this.periodo = periodo;
		this.alumno = alumno;
	}
	
	public Matricula(int codigo, String periodo, Alumno alumno) {		
		this.codigo = codigo;
		this.periodo = periodo;
		this.alumno = alumno;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
}

