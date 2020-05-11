package com.example.CamaraMicroservicio.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.CamaraMicroservicio.DTO.SensorDTO;
import com.example.CamaraMicroservicio.service.ICamaraServicio;

@RestController
@RequestMapping("camaraSensores")
@CrossOrigin
public class SensorController {
	@Autowired
	private ICamaraServicio camaraServicio;
	@GetMapping("/find/{id}")
	public List<SensorDTO> findASensor( @PathVariable long id ){
		return camaraServicio.sensoresasociados(id);
		}
	
	@GetMapping("/findns/{id}")
	public int findnSensor( @PathVariable long id ){
		return camaraServicio.getnumerodesensores(id);}
}
