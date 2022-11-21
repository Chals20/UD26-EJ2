package com.ej2.controller;

import java.util.List;
import com.ej2.dto.AsignadoA;
import com.ej2.service.AsignadoAServiceImpl;

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
public class AsignadoAController {

	@Autowired
	AsignadoAServiceImpl AsignadoAServiceImpl;
	
	//listar todos los AsignadoA
	@GetMapping("/asignadoa")
	public List<AsignadoA> listarAsignadoAs(){
		return AsignadoAServiceImpl.listarAsignadoAs();
	}
	
	//guardar un AsignadoA
	@PostMapping("/asignadoa")
	public AsignadoA salvarAsignadoA(@RequestBody AsignadoA asign) {
		return AsignadoAServiceImpl.guardarAsignadoA(asign);
	}
	
	//mostrar por id
	@GetMapping("/asignadoa/{id}") 
	public AsignadoA asignadoAXID(@PathVariable(name="id") Long id){ 
		AsignadoA asignID = new AsignadoA();//creo una instancia de la clase AsignadoA
		
		asignID=AsignadoAServiceImpl.AsignadoAXID(id);

		return asignID;
	}
	
	//Actualizar datos por ID
	@PutMapping("/asignadoa/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")Long id,@RequestBody AsignadoA asign) {
		
		AsignadoA asign_select= new AsignadoA();
		AsignadoA asign_update= new AsignadoA();
		
		asign_select= AsignadoAServiceImpl.AsignadoAXID(id);
		
		asign_select.setCientifico(asign.getCientifico());
		asign_select.setProyecto(asign.getProyecto());
		
		asign_update = AsignadoAServiceImpl.actualizarAsignadoA(asign_select);
		
		return asign_update;
	}
	
	//eliminar por ID
	@DeleteMapping("/asignadoa/{id}")
	public void eliminarAsignadoA(@PathVariable(name="id")Long id) {
		AsignadoAServiceImpl.eliminarAsignadoA(id);
	}
}

