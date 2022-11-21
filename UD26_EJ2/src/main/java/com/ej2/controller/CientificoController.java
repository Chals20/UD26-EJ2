package com.ej2.controller;

import java.util.List;
import com.ej2.dto.Cientifico;
import com.ej2.service.CientificoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientService;
	
	//listar todos los cientificos
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientService.listarCientificos();
	}
	
	//guardar un cientifico
	@PostMapping("/cientificos")
	public Cientifico guardaCientifico(@RequestBody Cientifico cient) {
		return cientService.guardarCientifico(cient);
	}
	
	//mostrar cientifico por dni
	@GetMapping("/cientificos/{dni}") 
	public Cientifico CientificoXID(@PathVariable(name="dni") String dni){ 
		Cientifico cientificoID = new Cientifico();

		cientificoID=cientService.findByDni(dni);

		return cientificoID;
	}
	
	//actualizar cientifico por ID
	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name="dni")String dni,@RequestBody Cientifico cient) {
		
		Cientifico cient_select= new Cientifico();
		Cientifico cient_update= new Cientifico();
		
		cient_select= cientService.findByDni(dni);
		
		cient_select.setNomApels(cient.getNomApels());
		cient_select.setAsignadoA(cient.getAsignadoA());
		
		cient_update = cientService.actualizarCientifico(cient_select);
		
		return cient_update;
	}
	
	//eliminar cientifico por dni
	@DeleteMapping("/cientificos/{dni}")
	public void eliminarCientifico(@PathVariable(name="dni")String dni) {
		cientService.eliminarCientifico(dni);
	}
}
