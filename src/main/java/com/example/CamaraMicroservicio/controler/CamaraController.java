package com.example.CamaraMicroservicio.controler;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.CamaraMicroservicio.DTO.CamaraDTO;
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
	public int altaCamara ( @RequestBody CamaraDTO cam ) {
		camaraServicio.altaCamara(cam);
		return 1;
	}
	
	@DeleteMapping("/eliminarCamara/{id}")
	public int elminarCamara ( @PathVariable long id  ) {
		camaraServicio.deleteCamara(id);
		return 0;
		
	}
	
	@PutMapping("/modificarCamara")
	public int modificarCamara ( @RequestBody CamaraDTO cam ) {
		camaraServicio.updateCamara(cam);
		return 0;
		
	}
	
}
