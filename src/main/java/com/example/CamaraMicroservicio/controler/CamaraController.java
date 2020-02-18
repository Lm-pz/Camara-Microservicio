package com.example.CamaraMicroservicio.controler;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/lista")
	public ArrayList<CamaraDTO> listaTodos (){
		return camaraServicio.obtenerTodos();
	}
	
	@PostMapping ("/alta")
	public int altaCamara ( @RequestBody CamaraDTO cam ) {
		camaraServicio.altaCamara(cam);
		return 1;
	}
	
	@DeleteMapping("/eliminar")
	public int elminarCamara ( @RequestBody CamaraDTO cam ) {
		camaraServicio.deleteCamara(cam);
		return 0;
		
	}
	
	@PutMapping("/modificar")
	public int modificarCamara ( @RequestBody CamaraDTO cam ) {
		camaraServicio.updateCamara(cam);
		return 0;
		
	}
	
}
