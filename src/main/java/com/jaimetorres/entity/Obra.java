package com.jaimetorres.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "obra")
public class Obra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nombre", nullable = false, length = 20)
	private String nombreObra;
	@Column(name = "pais", nullable = false, length = 30)
	private String pais;
	
	@ManyToOne
	@JoinColumn(name = "id_artista", nullable = false)
	private Artista artista;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreObra() {
		return nombreObra;
	}
	public void setNombreObra(String nombreObra) {
		this.nombreObra = nombreObra;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Artista getArtista() {
		artista.getId();
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
	
}
