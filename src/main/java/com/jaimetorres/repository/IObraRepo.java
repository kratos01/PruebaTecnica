package com.jaimetorres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jaimetorres.entity.Obra;


@Repository
public interface IObraRepo extends JpaRepository<Obra, Integer>{

	@Query(value = "select * from obra where id_artista =:id and pais = 'colombia'", nativeQuery = true)				
	List<Obra> buscarObra(@Param("id") Integer id);
	
	@Query(value = "select o from Obra o where o.artista.id =:id and pais = 'colombia'")
	List<Obra> buscarObra1(Integer id);
}
