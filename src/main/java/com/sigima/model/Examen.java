package com.sigima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examen")
public class Examen {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int idExamen;
	
	@Column(name="nombre", nullable = false,length = 50)
    private String nombre;
	
	@Column(name="descripcion", nullable = false,length = 70)
    private String tratamiento;

	public int getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	
}
