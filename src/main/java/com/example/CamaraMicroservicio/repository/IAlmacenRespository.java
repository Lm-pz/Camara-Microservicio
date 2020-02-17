package com.example.CamaraMicroservicio.repository;

import java.util.List;

import com.example.CamaraMicroservicio.DTO.CamaraDTO;



public interface IAlmacenRespository {

	public List<CamaraDTO> findAllCamaras ();
}
