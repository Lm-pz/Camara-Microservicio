package com.example.CamaraMicroservicio.controler;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.CamaraMicroservicio.DTO.EstadoDTO;
import com.example.CamaraMicroservicio.service.IEstadoServicio;

@RequestMapping("estado")
@RestController
@CrossOrigin
public class EstadoController {

	@Autowired
	private IEstadoServicio camaraestado;
	
	@GetMapping("/lista")
	public ArrayList<EstadoDTO> listaTodos (){
		return camaraestado.obtenerTodos();
	}
}
