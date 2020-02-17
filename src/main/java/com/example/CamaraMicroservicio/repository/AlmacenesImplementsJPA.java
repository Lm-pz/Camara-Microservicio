package com.example.CamaraMicroservicio.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.CamaraMicroservicio.DTO.CamaraDTO;
import com.example.CamaraMicroservicio.mapper.Mapper;
import com.example.CamaraMicroservicio.model.Camara;



@Component
public class AlmacenesImplementsJPA  implements IAlmacenRespository{
	private Mapper m=new Mapper();
	@Autowired
	private CamarasRepository cr;

	@Override
	public List<CamaraDTO> findAllCamaras() {
		List<CamaraDTO> camarasDto = new ArrayList<> ();
		List<Camara> cams =  cr.findAll();
		for(Camara c:cams) {
		camarasDto.add(
			m.camaraEntityaDto(c));
		}
		return camarasDto;
	}

}
