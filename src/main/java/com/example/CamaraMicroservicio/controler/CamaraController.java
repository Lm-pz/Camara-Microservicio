package com.example.CamaraMicroservicio.controler;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
}
