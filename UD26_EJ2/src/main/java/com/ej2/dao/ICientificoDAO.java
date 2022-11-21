package com.ej2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ej2.dto.Cientifico;

public interface ICientificoDAO extends JpaRepository<Cientifico, Long>{

	public Cientifico findByDni(String dni);

	public void deleteByDni(String dni);
}
