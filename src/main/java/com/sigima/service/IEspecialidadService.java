package com.sigima.service;

import java.util.List;

import com.sigima.model.Especialidad;



public interface IEspecialidadService {
Especialidad registrar(Especialidad especialidad);
	
	void modificar(Especialidad esoecialidad);
	
	void eliminar(int id);
	
	Especialidad listarID(int id);
	
	List<Especialidad>listar();


}
