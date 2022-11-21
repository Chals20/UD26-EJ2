package com.ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ej2.dao.IAsignadoADAO;
import com.ej2.dto.AsignadoA;

@Service 
public class AsignadoAServiceImpl implements IAsignadoAService{

	@Autowired
	IAsignadoADAO asignDAO;
	
	@Override
	public List<AsignadoA> listarAsignadoAs() {
		// TODO Auto-generated method stub
		return asignDAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignA) {
		// TODO Auto-generated method stub
			return asignDAO.save(asignA); //guardo el nuevo AsignadoA	
	}

	@Override
	public AsignadoA AsignadoAXID(Long id) {
		// TODO Auto-generated method stub
		return asignDAO.findById(id).get();
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA asignA) {
		// TODO Auto-generated method stub
		return asignDAO.save(asignA);
	}

	@Override
	public void eliminarAsignadoA(Long id) {
		asignDAO.deleteById(id);
		
	}
}
