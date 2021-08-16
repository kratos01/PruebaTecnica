package com.jaimetorres.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jaimetorres.entity.Museo;
import com.jaimetorres.entity.Obra;

import javassist.NotFoundException;


@Component
public interface IServicioArtista {

	public List<Obra> consultarArtista(int id) throws NotFoundException;
	
	public List<Museo> consultarMuseo(String ciudad);
}
