package com.example.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Docente;
import com.example.services.DocenteService;
@RestController
@RequestMapping("/docente")
public class DocenteController {

	@Autowired	
	private DocenteService docenteService;
	
		
	@GetMapping
    public ResponseEntity<ArrayList<Docente>> get(){
		
		return ResponseEntity.ok(docenteService.getAll());
		}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Docente docente){
		
		Docente savedDocente = docenteService.save(docente);
		
		 if (savedDocente == null) {
		        return ResponseEntity.badRequest().body("No se puede crear un Docente con el mismo tipo y numero de documento");
		    }
		
		 return ResponseEntity.ok(savedDocente);
		}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Docente docente){
	    Docente updatedDocente = docenteService.update(docente);
	    if (updatedDocente == null) {
	        return ResponseEntity.badRequest().body("No se puede actualizar un Docente que no existe.");
	    }
	    return ResponseEntity.ok(updatedDocente);
	}
	
	@DeleteMapping("/{id}") 
	public ResponseEntity<String> delete(@PathVariable("id") Long id){
	    String deletedDocente = docenteService.delete(id);
	    if (deletedDocente == null) {
	        return ResponseEntity.badRequest().body("No se puede eliminar un Docente que no existe.");
	    }
	    return ResponseEntity.ok(deletedDocente);
	}
	
	}