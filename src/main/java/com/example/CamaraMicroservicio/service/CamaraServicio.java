package com.example.CamaraMicroservicio.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.CamaraMicroservicio.DTO.CamaraDTO;
import com.example.CamaraMicroservicio.repository.IAlmacenRespository;


@Service
public class CamaraServicio implements ICamaraServicio{

	@Autowired
	IAlmacenRespository repo;
	public ArrayList<CamaraDTO> obtenerTodos() {
		return (ArrayList<CamaraDTO>)repo.findAllCamaras();
	}
}
