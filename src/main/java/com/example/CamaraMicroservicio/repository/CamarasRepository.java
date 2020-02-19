package com.example.CamaraMicroservicio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.CamaraMicroservicio.model.Camara;


public interface CamarasRepository extends JpaRepository <Camara, Long>{

	@Query("select count(*) from Camara c where c.almacen_id = :id")
	int getNCamarasAlmacen (@Param("id") Long id);
	
	@Query("From Camara c where c.almacen_id = :id")
	List<Camara> getCamarasAlmacen (@Param("id") Long id);

}
