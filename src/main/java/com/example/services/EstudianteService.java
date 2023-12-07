package com.example.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.models.Estudiante;
import com.example.repositories.EstudianteRepository;

@Service
public class EstudianteService {

	@Autowired
	private EstudianteRepository estudianteRepository;
	
	public ArrayList<Estudiante> getAll(){
		return (ArrayList<Estudiante>)estudianteRepository.findAll();
		}
	
	public Estudiante save(Estudiante estudiante) {
		 return estudianteRepository.save(estudiante);
		}
		
	
	public Estudiante Update(Estudiante estudiante) {
	
		if(estudianteRepository.existsById(estudiante.getId())) {
			return estudianteRepository.save(estudiante);
		}else {
			return null;
		}
		
	}
	
	public void delete (Long id) {
		estudianteRepository.deleteById(id);
	}
	
}