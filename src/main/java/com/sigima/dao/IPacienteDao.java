package com.sigima.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigima.model.Paciente;

public interface IPacienteDao extends JpaRepository<Paciente, Integer> {

}
