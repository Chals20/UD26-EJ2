package com.ej2.service;

import java.util.List;

import com.ej2.dto.Cientifico;

public interface ICientificoService {

	//Métodos del CRUD
	public List<Cientifico> listarCientificos(); //Listar All
	
	public Cientifico guardarCientifico(Cientifico Cientifico); //CREATE
	
	public Cientifico findByDni(String dni);//buscar cientifico por dni READ
	
	public Cientifico actualizarCientifico(Cientifico Cientifico); //UPDATE
	
	public void eliminarCientifico(String dni);//Elimina el cientifico por dni DELETE
}
