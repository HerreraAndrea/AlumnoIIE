package com.idat.AlumnoIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AlumnoIIE.model.Aula;
import com.idat.AlumnoIIE.repository.AulaRepository;

@Service
public class AulaServiceImpl implements AulaService{

	
	@Autowired
	private AulaRepository repository;
	
	@Override
	public List<Aula> listar() {
		return repository.findAll();
	}

	@Override
	public Aula obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Aula aula) {
		repository.save(aula);
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void actualizar(Aula aula) {
		repository.saveAndFlush(aula);
		
	}

}
