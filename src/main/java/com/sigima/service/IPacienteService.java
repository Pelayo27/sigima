package com.sigima.service;

import java.util.List;

import com.sigima.model.Paciente;



public interface IPacienteService {

 Paciente registrar(Paciente paciente);
	
	void modificar(Paciente paciente);
	
	void eliminar(int id);
	
	Paciente listarID(int id);
	
	List<Paciente>listar();

}
