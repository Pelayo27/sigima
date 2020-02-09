package com.sigima.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.crypto.Data;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;



@Entity
@Table(name = "consulta")
public class Consulta {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int idConsulta;
	
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fecha; 
	
	@OneToMany(mappedBy = "consulta", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE }, 
			fetch = FetchType.LAZY, orphanRemoval = true)
	private  List<DetalleConsulta> detalleconsulta;
	
	@ManyToOne
    @JoinColumn(name="idPaciente", nullable = false)
    private Paciente idPaciente;
	@ManyToOne
    @JoinColumn(name="idMedico", nullable = false)
    private Medico idMedico;
	@ManyToOne
    @JoinColumn(name="idEspecialidad", nullable = false)
    private Especialidad idEspecialidad;
	
	

}
