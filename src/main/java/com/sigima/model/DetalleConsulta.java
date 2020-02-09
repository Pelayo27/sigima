package com.sigima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "detalleConsulta")
public class DetalleConsulta {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int idDetalleConsulta;
	@OneToMany
    @JoinColumn(name="idConsulta", nullable = false)
    private Paciente idConsulta;
	
	@Column(name="diagnostico", nullable = false,length = 30)
    private String diagnostico;
	
	@Column(name="tratamiento", nullable = false,length = 30)
    private String tratamiento;
	

}
