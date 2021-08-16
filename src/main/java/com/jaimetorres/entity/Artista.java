package com.jaimetorres.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artista")
public class Artista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "tipo_ide", nullable = false, length = 5)
	private String tipoIde;
	
	@Column(name = "numero_ide", nullable = false, length = 20)
	private String numeroIde;
	
	@Column(name = "nombre", nullable = false, length = 30)
	private String nombre;
	
	@Column(name = "apellido", nullable = false, length = 30)
	private String apellido;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroIde() {
		return numeroIde;
	}
	public void setNumeroIde(String numeroIde) {
		this.numeroIde = numeroIde;
	}
	
	public String getTipoIde() {
		return tipoIde;
	}
	public void setTipoIde(String tipoIde) {
		this.tipoIde = tipoIde;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
