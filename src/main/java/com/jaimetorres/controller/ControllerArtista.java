package com.jaimetorres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaimetorres.entity.Museo;
import com.jaimetorres.entity.Obra;
import com.jaimetorres.service.IServicioArtista;

import javassist.NotFoundException;

/**
 * 
 * @author David Arias
 *esta clase es la que controla y hace el llamado a los  servicios.
 */

@RestController
@RequestMapping("/artista")
public class ControllerArtista {
	
	@Autowired
	private IServicioArtista service;
	/**
	 * controlador de la calse que devuelve la lista de las obras
	 * @param id
	 * @return
	 * @throws NotFoundException
	 */
	
	@GetMapping(path = "/consultarObra/{id}")
	public ResponseEntity<List<Obra>> consultarObra(@PathVariable int id) throws NotFoundException{
		 List<Obra> artista = service.consultarArtista(id);
		return new ResponseEntity<List<Obra>>(artista, HttpStatus.OK);
	}
	/**
	 * controlador de la clase que devuelve la lista de museos 
	 * @param ciudad
	 * @return 
	 */
	@GetMapping(path = "/consultarMuseo/{ciudad}")
	public ResponseEntity<List<Museo>> consultarMuseo(@PathVariable String ciudad){
		 List<Museo> museo = service.consultarMuseo(ciudad);		 
		return new ResponseEntity<List<Museo>>(museo, HttpStatus.OK);
	}
}
