package com.ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ej2.dao.IProyectoDAO;
import com.ej2.dto.Proyecto;

@Service 
public class ProyectoServiceImpl implements IProyectoService{

	@Autowired
	IProyectoDAO proyectDAO;
	
	@Override
	public List<Proyecto> listarProyectos() {
		// TODO Auto-generated method stub
		return proyectDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proy) {
		// TODO Auto-generated method stub
			return proyectDAO.save(proy); //guardo el nuevo Proyecto	
	}

	public Proyecto findById(String id) {
		// TODO Auto-generated method stub
		return proyectDAO.findById(id);
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proy) {
		// TODO Auto-generated method stub
		return proyectDAO.save(proy);
	}

	@Override
	public void eliminarProyecto(Long id) {
		proyectDAO.deleteById(id);
		
	}
}
