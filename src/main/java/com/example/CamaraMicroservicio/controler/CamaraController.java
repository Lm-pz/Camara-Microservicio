package com.example.CamaraMicroservicio.controler;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.CamaraMicroservicio.DTO.CamaraDTO;
import com.example.CamaraMicroservicio.DTO.SensorDTO;
import com.example.CamaraMicroservicio.service.ICamaraServicio;

@RequestMapping("camara")
@RestController
public class CamaraController {

	@Autowired
	private ICamaraServicio camaraServicio;
	
	@GetMapping("/listaCamaras")
	public ArrayList<CamaraDTO> listaTodos (){
		return camaraServicio.obtenerTodos();
	}
	
	@PostMapping ("/altaCamara")
	public CamaraDTO altaCamara ( @RequestBody CamaraDTO cam ) {
		
		return camaraServicio.altaCamara(cam);
	}
	
	@DeleteMapping("/eliminarCamara/{id}")
	public int elminarCamara ( @PathVariable long id  ) {
		
		return camaraServicio.deleteCamara(id);
		
	}
	
	@PutMapping("/modificarCamara")
	public int modificarCamara ( @RequestBody CamaraDTO cam ) {
		
		return camaraServicio.updateCamara(cam);
		
	}
	
	@GetMapping("/findCamara/{id}")
	public CamaraDTO findCamara ( @PathVariable long id ){
		return camaraServicio.findCamera(id);
	}
	
	@GetMapping("/findNCamara/{id}")
	public int findNCamara ( @PathVariable long id ){
		return camaraServicio.NCamarasAlmacen(id);
	}
	
	@GetMapping("/findCAlmacen/{id}")
	public ArrayList<CamaraDTO> findACamara ( @PathVariable long id ){
		return camaraServicio.obtenerCamarasAlmacen(id);	
		}
	
	@GetMapping("/find/{id}")
	public List<SensorDTO> findASensor( @PathVariable long id ){
		return camaraServicio.sensoresasociados(id);
		}
	
	@GetMapping("/findns/{id}")
	public int findnSensor( @PathVariable long id ){
		return camaraServicio.getnumerodesensores(id);}
}
