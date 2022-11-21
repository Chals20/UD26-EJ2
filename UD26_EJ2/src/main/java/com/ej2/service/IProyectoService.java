package com.ej2.service;

import java.util.List;

import com.ej2.dto.Proyecto;

public interface IProyectoService {

	//Métodos del CRUD
	public List<Proyecto> listarProyectos(); //Listar All
	
	public Proyecto guardarProyecto(Proyecto Proyecto); //CREATE
	
	public Proyecto findById(String id);//buscar proveedor por id READ
	
	public Proyecto actualizarProyecto(Proyecto Proyecto); //UPDATE
	
	public void eliminarProyecto(Long id);//DELETE
}
