package com.example.CamaraMicroservicio.repository;

import java.util.List;

import com.example.CamaraMicroservicio.DTO.CamaraDTO;
import com.example.CamaraMicroservicio.model.Camara;



public interface IAlmacenRespository {

	public List<CamaraDTO> findAllCamaras ();
	
	public int addCamara(CamaraDTO cam);
	
	public boolean existeEntidad(Long id);
	
	public int deleteCamara(CamaraDTO cam);
	
	public int updateCamara(CamaraDTO cam);
}
