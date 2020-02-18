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
	

	@Override
	public int altaCamara(CamaraDTO c) {
		if(!repo.existeEntidad(c.getCamara_id()))
			repo.addCamara(c);
		return 0;
	}


	@Override
	public int deleteCamara(long id) {
		if(repo.existeEntidad(id))
			repo.deleteCamara(id)	;	return 0;
	}


	@Override
	public int updateCamara(CamaraDTO camara) {
		if(repo.existeEntidad(camara.getCamara_id()))
			repo.updateCamara(camara)	;		
		return 0;
	}
}
