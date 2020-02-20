package com.example.CamaraMicroservicio.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
				c.getLargo_camara(), c.getTemperatura_actual(),est.getEstado(),c.getAlmacen_id(),
				c.getNombre_camara(),c.getEan(),c.getFechaentrada().toString(),
				c.getFechasalida().toString());
		return camara;
	}
	
	public Camara DtoaCamaraEntity(CamaraDTO c) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
		Estado e=new Estado();
		e.setEstado(c.getEstado());
		Camara camara=new Camara();
		camara.setCamara_id(c.getCamara_id());
		camara.setAncho_camara(c.getAncho_camara());
		camara.setLargo_camara(c.getLargo_camara());
		camara.setAlmacen_id(c.getAlmacen_id());
		camara.setEstado(e);
		camara.setTemperatura_actual(c.getTemperatura_actual());
		camara.setNombre_camara(c.getNombre_camara());
		camara.setEan(c.getEan());
		LocalDate date=(c.getFechaentrada()!=null?LocalDate.parse(c.getFechaentrada(), formatter):null);
		camara.setFechaentrada(date);
		date=(c.getFechasalida()!=null?LocalDate.parse(c.getFechasalida(), formatter):null);
		camara.setFechasalida(date);
		return camara;
	}
}
