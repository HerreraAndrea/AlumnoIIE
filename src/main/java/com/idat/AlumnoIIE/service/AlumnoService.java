package com.idat.AlumnoIIE.service;

import java.util.List;

import com.idat.AlumnoIIE.model.Alumno;

public interface AlumnoService {

	// Metodos o acciones que tendra
	List<Alumno> listar();
	Alumno obtenerId(Integer id);
	void guardar(Alumno alumno);
	void eliminar(Integer id);
	void actualizar(Alumno alumno);
}
