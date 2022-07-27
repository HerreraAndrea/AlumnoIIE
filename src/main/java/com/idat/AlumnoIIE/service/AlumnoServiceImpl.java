package com.idat.AlumnoIIE.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AlumnoIIE.model.Alumno;
import com.idat.AlumnoIIE.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository repository;
	
	
	/* Creamos el constructor de esta clase para que se ejectue una sola vez
	public AlumnoServiceImpl() {
		// Usamos el constructor de la clase Alumno
		listarAlumno.add(new Alumno(1, "Wilder", "Espinoza"));
		listarAlumno.add(new Alumno(2, "Andrea", "Herrera"));
		listarAlumno.add(new Alumno(3, "Juan", "Perez"));
		listarAlumno.add(new Alumno(4, "Ana", "Rosales"));
	}
*/
	@Override
	public List<Alumno> listar() {
		return repository.findAll();
	}

	@Override
	public Alumno obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Alumno alumno) {
		repository.save(alumno);
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void actualizar(Alumno alumno) {
		repository.saveAndFlush(alumno);
		
	}

}
