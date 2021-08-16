package com.jaimetorres.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaimetorres.entity.Museo;
import com.jaimetorres.entity.Obra;
import com.jaimetorres.repository.IMuseoRepo;
import com.jaimetorres.repository.IObraRepo;
import com.jaimetorres.service.IServicioArtista;

import javassist.NotFoundException;
/**
 * clase que contiene los servicios rest.
 * @author David Arias
 *
 */
@Service
public class ServicioArtista implements IServicioArtista{

	@Autowired
	private IObraRepo repoObra;
	
	@Autowired
	private IMuseoRepo repoMuseo;
	
	/**
	 * servicios rest para consultar obras por id artista
	 */
	@Override
	public List<Obra> consultarArtista(int id) throws NotFoundException{
		List<Obra> artista =  repoObra.buscarObra(id);
		if(artista.isEmpty()) {
			throw new NotFoundException("El artista no tiene obras registradas en colombia");
		}
		
		return artista;
	}
	/**
	 * servicio rest para consultar museos por ciudad
	 */
	@Override
	public List<Museo> consultarMuseo(String ciudad) {
		 List<Museo> museo = repoMuseo.buscarMuseo(ciudad);
		return museo;
	}

}
