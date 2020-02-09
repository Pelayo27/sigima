package com.sigima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigima.dao.IEspecialidadDao;
import com.sigima.model.Especialidad;
@Service
public class EspecialidadServiceImp implements IEspecialidadService {
	
	@Autowired
	private IEspecialidadDao dao;

	@Override
	public Especialidad registrar(Especialidad especialidad) {
		// TODO Auto-generated method stub
		return dao.save(especialidad);
	}

	@Override
	public void modificar(Especialidad esoecialidad) {
		// TODO Auto-generated method stub
		dao.save(esoecialidad);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Override
	public Especialidad listarID(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Especialidad> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
