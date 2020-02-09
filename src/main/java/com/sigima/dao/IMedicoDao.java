package com.sigima.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigima.model.Medico;

public interface IMedicoDao extends JpaRepository<Medico, Integer> {

}
