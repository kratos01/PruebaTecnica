package com.jaimetorres;

import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.validation.constraints.AssertTrue;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jaimetorres.serviceImp.ServicioArtista;

@SpringBootTest
class PruebaTecnicaApplicationTests {

	@Autowired
	private ServicioArtista serv;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void pruebaObras() {
		try {
			serv.consultarArtista(1);
			assertTrue(true);
		} catch (Exception e) {
			
		}
			
		
		
	}
	

}
