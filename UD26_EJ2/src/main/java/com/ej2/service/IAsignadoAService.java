package com.ej2.service;

import java.util.List;

import com.ej2.dto.AsignadoA;

public interface IAsignadoAService {

	//Métodos del CRUD
	public List<AsignadoA> listarAsignadoAs(); //Listar All
	
	public AsignadoA guardarAsignadoA(AsignadoA AsignadoA); //CREATE
	
	public AsignadoA AsignadoAXID(Long id); //READ
	
	public AsignadoA actualizarAsignadoA(AsignadoA AsignadoA); //UPDATE
	
	public void eliminarAsignadoA(Long id);//DELETE
}
