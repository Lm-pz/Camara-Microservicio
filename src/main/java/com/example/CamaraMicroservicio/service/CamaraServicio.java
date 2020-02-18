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
	public CamaraDTO altaCamara(CamaraDTO c) {
		CamaraDTO cam=null;
		if(!repo.existeEntidad(c.getCamara_id()))
			cam=repo.addCamara(c);
		return cam;
	}


	@Override
	public int deleteCamara(long id) {
		int exito=0;
		if(repo.existeEntidad(id))
			exito=repo.deleteCamara(id)	;	
		return exito;
	}


	@Override
	public int updateCamara(CamaraDTO camara) {
		int exito=0;
		if(repo.existeEntidad(camara.getCamara_id()))
			exito=repo.updateCamara(camara)	;		
		return exito;
	}
	
	@Override
	public CamaraDTO findCamera(long id) {
		CamaraDTO cam=null;
		if(repo.existeEntidad(id))
		cam=repo.findCamara(id);
		return cam;
	}
}
