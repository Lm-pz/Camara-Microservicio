package com.example.CamaraMicroservicio.mapper;

import org.springframework.stereotype.Component;

import com.example.CamaraMicroservicio.DTO.CamaraDTO;
import com.example.CamaraMicroservicio.DTO.EstadoDTO;
import com.example.CamaraMicroservicio.model.Camara;
import com.example.CamaraMicroservicio.model.Estado;

@Component
public class Mapper {

	public CamaraDTO camaraEntityaDto(Camara c) {
		EstadoDTO est=new EstadoDTO(c.getEstado().getEstado());
		CamaraDTO camara = new CamaraDTO(c.getCamara_id(),c.getAncho_camara(),
				c.getLargo_camara(), c.getTemperatura_actual(),est,c.getAlmacen_id(),
				c.getNombre_camara());
		return camara;
	}
	
	public Camara DtoaCamaraEntity(CamaraDTO c) {
		Estado e=new Estado();
		e.setEstado(c.getEstado().getEstado());
		Camara camara=new Camara();
		camara.setCamara_id(c.getCamara_id());
		camara.setAncho_camara(c.getAncho_camara());
		camara.setLargo_camara(c.getLargo_camara());
		camara.setAlmacen_id(c.getAlmacen_id());
		camara.setEstado(e);
		camara.setTemperatura_actual(c.getTemperatura_actual());
		camara.setNombre_camara(c.getNombre_camara());
		return camara;
	}
}
