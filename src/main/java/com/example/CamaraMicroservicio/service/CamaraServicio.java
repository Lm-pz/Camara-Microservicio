package com.example.CamaraMicroservicio.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.CamaraMicroservicio.DTO.CamaraDTO;
import com.example.CamaraMicroservicio.DTO.SensorDTO;
import com.example.CamaraMicroservicio.repository.ICamaraRepository;

@Service
public class CamaraServicio implements ICamaraServicio {

	@Autowired
	RestTemplate resttemplate;
	@Autowired
	ICamaraRepository repo;

	public ArrayList<CamaraDTO> obtenerTodos() {
		return (ArrayList<CamaraDTO>) repo.findAllCamaras();
	}

	@Override
	public CamaraDTO altaCamara(CamaraDTO c) {
		CamaraDTO cam = null;
		if (!repo.existeEntidad(c.getCamara_id()))
			cam = repo.addCamara(c);
		return cam;
	}

	@Override
	public int deleteCamara(long id) {
		int exito = 0;
		String url = "http://localhost:8081/sensor/modificarSensor/";
		if (repo.existeEntidad(id)) {
			exito = repo.deleteCamara(id);
			List<SensorDTO> sensores = sensoresasociados(id);
			if (!sensores.isEmpty()) {
				sensores.stream().forEach(x -> {
					x.setCamara_id(-1);
					resttemplate.put(url, x);
				});

			}
		}

		return exito;
	}

	@Override
	public int updateCamara(CamaraDTO camara) {
		int exito = 0;
		if (repo.existeEntidad(camara.getCamara_id()))
			exito = repo.updateCamara(camara);

		return exito;
	}

	@Override
	public CamaraDTO findCamera(long id) {
		CamaraDTO cam = null;
		if (repo.existeEntidad(id))
			cam = repo.findCamara(id);
		return cam;
	}

	@Override
	public int NCamarasAlmacen(long id) {
		return repo.NCamarasAlmacen(id);
	}

	@Override
	public ArrayList<CamaraDTO> obtenerCamarasAlmacen(long id) {
		List<CamaraDTO> camarasDto = new ArrayList<>();
		if (repo.NCamarasAlmacen(id) > 0)
			camarasDto = repo.getCamarasAlmacen(id);
		return (ArrayList<CamaraDTO>) camarasDto;
	}

	public List<SensorDTO> sensoresasociados(long id) {
		String url = "http://localhost:8081/sensor/findCSensor/" + id;
		ResponseEntity<SensorDTO[]> responseEntity = resttemplate.getForEntity(url, SensorDTO[].class);
		List<SensorDTO> sensores = Arrays.asList(responseEntity.getBody());
		return sensores;
	}

	public int getnumerodesensores(long id) {
		String url = "http://localhost:8081/sensor/findNSensor/" + id;
		return resttemplate.getForObject(url, int.class);
	}

	public int asignarproducto(CamaraDTO camara) {
		int exito = 0;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
		LocalDate ld = LocalDate.parse(camara.getFechasalida(), formatter);
		ld = ld.plusDays(3);
		if (ld.isBefore(LocalDate.now())) {
			exito = 1;
			camara.setEstado("Ocupado");
			camara.setFechasalida(null);
			repo.updateCamara(camara);
		}
		return exito;
	}
}
