package com.ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ej2.dao.ICientificoDAO;
import com.ej2.dto.Cientifico;

@Service 
public class CientificoServiceImpl implements ICientificoService{

	@Autowired
	ICientificoDAO cientDAO;
	
	@Override
	public List<Cientifico> listarCientificos() {
		// TODO Auto-generated method stub
		return cientDAO.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cient) {
		// TODO Auto-generated method stub
			return cientDAO.save(cient); 	
	}

	public Cientifico findByDni(String dni) {
		// TODO Auto-generated method stub
		return cientDAO.findByDni(dni);
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cient) {
		// TODO Auto-generated method stub
		return cientDAO.save(cient);
	}

	@Override
	public void eliminarCientifico(String dni) {
		cientDAO.deleteByDni(dni);
		
	}

}
