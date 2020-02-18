package com.example.CamaraMicroservicio.service;

import java.util.ArrayList;

import com.example.CamaraMicroservicio.DTO.CamaraDTO;


public interface ICamaraServicio {
	public ArrayList<CamaraDTO> obtenerTodos();
	
	public int altaCamara(CamaraDTO camara);
	
	public int deleteCamara(CamaraDTO camara);
	
	public int updateCamara(CamaraDTO camara);
}
