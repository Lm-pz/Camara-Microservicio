package com.example.CamaraMicroservicio.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.CamaraMicroservicio.model.Camara;



public interface CamarasRepository extends JpaRepository <Camara, Long>{

	@Query("select r from Camara r where r.camara_id = :id")
	Camara getCamera (Long id);
	

}
