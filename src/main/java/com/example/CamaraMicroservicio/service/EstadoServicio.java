package com.example.CamaraMicroservicio.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CamaraMicroservicio.DTO.CamaraDTO;
import com.example.CamaraMicroservicio.DTO.EstadoDTO;
import com.example.CamaraMicroservicio.repository.IEstadosRepository;

@Service
public class EstadoServicio implements IEstadoServicio {
	@Autowired
	IEstadosRepository repo;
	public ArrayList<EstadoDTO> obtenerTodos() {
		return (ArrayList<EstadoDTO>) repo.findAllestados();
	}
}
