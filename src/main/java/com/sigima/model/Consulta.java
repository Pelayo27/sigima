package com.sigima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.crypto.Data;



@Entity
@Table(name = "consulta")
public class Consulta {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int idConsulta;
	
	
	@Column(name = "fecha", nullable = false)
	public Data fecha;
	@OneToMany
    @JoinColumn(name="idPaciente", nullable = false)
    private Paciente idPaciente;
	@OneToMany
    @JoinColumn(name="idMedico", nullable = false)
    private Medico idMedico;
	@OneToMany
    @JoinColumn(name="idEspecialidad", nullable = false)
    private Especialidad idEspecialidad;
	
	

}
