package com.example.CamaraMicroservicio.repository;

import java.util.List;

import com.example.CamaraMicroservicio.DTO.CamaraDTO;
import com.example.CamaraMicroservicio.model.Camara;



public interface IAlmacenRespository {

	public List<CamaraDTO> findAllCamaras ();
	
	public CamaraDTO addCamara(CamaraDTO cam);
	
	public boolean existeEntidad(Long id);
	
	public int deleteCamara(long id);
	
	public int updateCamara(CamaraDTO cam);
	
	public CamaraDTO findCamara(long id);

}
