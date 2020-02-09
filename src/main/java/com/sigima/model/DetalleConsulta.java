package com.sigima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "detalleConsulta")
public class DetalleConsulta {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int idDetalleConsulta;
	
	@JsonIgnore
	@ManyToOne
    @JoinColumn(name="id_Consulta", nullable = false)
    private Consulta consulta;
	
	@Column(name="diagnostico", nullable = false,length = 30)
    private String diagnostico;
	@Column(name="tratamiento", nullable = false,length = 30)
    private String tratamiento;
	

}
