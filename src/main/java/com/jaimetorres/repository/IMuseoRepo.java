package com.jaimetorres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jaimetorres.entity.Museo;

public interface IMuseoRepo extends JpaRepository<Museo, Integer>{

	@Query(value = "select * from museo where ciudad = :ciudad and nombre ilike '%l%'", nativeQuery = true)				
	List<Museo> buscarMuseo(@Param("ciudad") String ciudad);
}
