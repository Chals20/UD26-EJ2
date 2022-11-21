package com.ej2.controller;

import java.util.List;
import com.ej2.dto.Proyecto;
import com.ej2.service.ProyectoServiceImpl;

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
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectService;
	
	//listar todos los proyectos
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos(){
		return proyectService.listarProyectos();
	}
	
	//guardar un proyecto
	@PostMapping("/proyectos")
	public Proyecto guardaProyecto(@RequestBody Proyecto proyect) {
		return proyectService.guardarProyecto(proyect);
	}
	
	//mostrar proyecto por id
	@GetMapping("/proyectos/{id}") 
	public Proyecto proyectoXID(@PathVariable(name="id") String id){ 
		Proyecto proyectID = new Proyecto();
		
		proyectID=proyectService.findById(id);

		return proyectID;
	}
	
	//actualizar proyceto ID
	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")String id,@RequestBody Proyecto Proyecto) {
		
		Proyecto proyect_select= new Proyecto();
		Proyecto proyect_update= new Proyecto();
		
		proyect_select= proyectService.findById(id);
		
		proyect_select.setNombre(Proyecto.getNombre());
		proyect_select.setHoras(Proyecto.getHoras());
		proyect_select.setAsignadoA(Proyecto.getAsignadoA());
		
		proyect_update = proyectService.actualizarProyecto(proyect_select);
		
		return proyect_update;
	}
	
	//eliminar proyector por ID
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name="id")Long id) {
		proyectService.eliminarProyecto(id);
	}
}
