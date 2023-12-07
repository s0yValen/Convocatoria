package com.example.models;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(nullable = false , unique = true)

	private Long id;
	
	private String nombres;
	private String apellidos;
	private String TipoD;
	private String numeroDoc;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTipoD() {
		return TipoD;
	}
	public void setTipoD(String tipoD) {
		TipoD = tipoD;
	}
	public String getNumeroDoc() {
		return numeroDoc;
	}
	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}
	
}
