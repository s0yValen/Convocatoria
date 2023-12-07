package com.example.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Docente;
import com.example.repositories.DocenteRepository;

@Service
public class DocenteService {

	@Autowired
	private DocenteRepository docenteRepository;
	
	public ArrayList<Docente> getAll(){
		return (ArrayList<Docente>)docenteRepository.findAll();
		}
	
	
	public Docente save(Docente docente) {
        Docente existingDocente = docenteRepository.findByTipoDocumentoAndNumeroDocumento(docente.getTipoDocumento(), docente.getNumeroDocumento());

        if (existingDocente != null) {
            return null;
        }
        return docenteRepository.save(docente);
	}
	

	
	public Docente update(Docente docente) {
	    if(docenteRepository.existsById(docente.getId())) {
	        return docenteRepository.save(docente);
	    } else {
	        return null;
	    }
	}
	
	
	public String delete(Long id) {
	    if(docenteRepository.existsById(id)) {
	        docenteRepository.deleteById(id);
	        return "Docente eliminado";
	    } else {
	        return null;
	    }
	}
}
