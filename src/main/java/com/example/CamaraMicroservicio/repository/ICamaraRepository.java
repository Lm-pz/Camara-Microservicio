package com.example.CamaraMicroservicio.repository;

import java.util.List;
import com.example.CamaraMicroservicio.DTO.CamaraDTO;

public interface ICamaraRepository {

	public List<CamaraDTO> findAllCamaras ();
	
	public CamaraDTO addCamara(CamaraDTO cam);
	
	public boolean existeEntidad(Long id);
	
	public int deleteCamara(long id);
	
	public int updateCamara(CamaraDTO cam);
	
	public CamaraDTO findCamara(long id);
	
	public int NCamarasAlmacen(long id);
	
	public List<CamaraDTO> getCamarasAlmacen(long id);

}
