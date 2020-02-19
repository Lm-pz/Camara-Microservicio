package com.example.CamaraMicroservicio.service;

import java.util.ArrayList;
import java.util.List;

import com.example.CamaraMicroservicio.DTO.CamaraDTO;
import com.example.CamaraMicroservicio.DTO.SensorDTO;



public interface ICamaraServicio {
	
	public ArrayList<CamaraDTO> obtenerTodos();
	
	public CamaraDTO altaCamara(CamaraDTO camara);
	
	public int deleteCamara(long id);
	
	public int updateCamara(CamaraDTO camara);

	public CamaraDTO findCamera(long id);
	
	int NCamarasAlmacen(long id);
	
	ArrayList<CamaraDTO> obtenerCamarasAlmacen(long id);
	
	List<SensorDTO> sensoresasociados(long id);
	
	public int getnumerodesensores(long id);
}
