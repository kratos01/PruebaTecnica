package com.jaimetorres.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "museo")
public class Museo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nombre", nullable = false, length = 30)
	private String nombreMuseo;
	@Column(name = "pais", nullable = false, length = 30)
	private String pais;
	@Column(name = "ciudad", nullable = false, length = 30)
	private String ciudad;
	@Column(name = "direccion", nullable = false, length = 30)
	private String direccion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreMuseo() {
		return nombreMuseo;
	}
	public void setNombreMuseo(String nombreMuseo) {
		this.nombreMuseo = nombreMuseo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
