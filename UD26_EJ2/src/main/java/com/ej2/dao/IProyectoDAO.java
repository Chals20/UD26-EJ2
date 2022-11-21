package com.ej2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ej2.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, Long>{

	public Proyecto findById(String id);
}
