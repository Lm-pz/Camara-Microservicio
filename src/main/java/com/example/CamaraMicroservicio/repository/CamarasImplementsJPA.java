package com.example.CamaraMicroservicio.repository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.CamaraMicroservicio.DTO.CamaraDTO;
import com.example.CamaraMicroservicio.mapper.Mapper;
import com.example.CamaraMicroservicio.model.Camara;



@Component
public class CamarasImplementsJPA  implements ICamaraRepository{
	@Autowired
	private Mapper m;
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

	@Override
	public CamaraDTO addCamara(CamaraDTO cam) {
		Camara c= m.DtoaCamaraEntity(cam);
		Camara aux=cr.save(c);
		return m.camaraEntityaDto(aux);
	}

	
	public boolean existeEntidad(Long id) {
		return cr.existsById(id);
	}

	@Override
	public int deleteCamara(long id){
		cr.deleteById(id);
		return 1;
	}

	@Override
	public int updateCamara(CamaraDTO cam) {
		Camara c= m.DtoaCamaraEntity(cam);
		cr.save(c);		
		return 1;
	}

	@Override
	public CamaraDTO findCamara(long id) {
		Camara c= cr.findById(id).get();
		return m.camaraEntityaDto(c);
	}

	@Override
	public int NCamarasAlmacen(long id) {
		return cr.getNCamarasAlmacen(id);
	}

	@Override
	public List<CamaraDTO> getCamarasAlmacen(long id) {
		List<CamaraDTO> camarasDto = new ArrayList<> ();
		List<Camara> cams = cr.getCamarasAlmacen(id);
		for(Camara c:cams) {
		camarasDto.add(
			m.camaraEntityaDto(c));
		}
		return camarasDto;
	}
	
	

}
