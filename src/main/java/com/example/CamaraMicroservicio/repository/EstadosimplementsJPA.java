package com.example.CamaraMicroservicio.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.CamaraMicroservicio.DTO.EstadoDTO;
import com.example.CamaraMicroservicio.mapper.Mapper;
import com.example.CamaraMicroservicio.model.Estado;

@Component
public class EstadosimplementsJPA  implements IEstadosRepository{
	@Autowired
	private Mapper m;
	@Autowired
	private EstadosRepository er;

	public List<EstadoDTO> findAllestados() {
		List<EstadoDTO> camarasDto = new ArrayList<> ();
		List<Estado> es =  er.findAll();
		for(Estado c:es) {
		camarasDto.add(
			m.estadoentityaDTO(c));
		}
		return camarasDto;
	}
}
