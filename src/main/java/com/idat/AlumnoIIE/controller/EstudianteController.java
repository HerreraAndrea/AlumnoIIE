package com.idat.AlumnoIIE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.AlumnoIIE.model.Alumno;
import com.idat.AlumnoIIE.service.AlumnoService;

@Controller 
@RequestMapping("/api/estudiante/v1") // recurso principal
public class EstudianteController {

	@Autowired
	private AlumnoService service;
	
	@GetMapping("/hola")
	public @ResponseBody String holaMundo() {
		return "Hola mundo :)";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Alumno> listarAlumno(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Alumno obtenerAlumnoId(@PathVariable Integer id) {
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Alumno alumno) {
		service.guardar(alumno);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Alumno alumno) {
		service.actualizar(alumno);
	}
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
	//@ResponseBody para que te devuelva un codigo de respuesta STATUS(?) o DATOS. 
	// @RequestBody para que reciba datos
}
