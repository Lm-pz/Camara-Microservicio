package com.example.CamaraMicroservicio.repository;

import java.util.List;

import com.example.CamaraMicroservicio.DTO.EstadoDTO;

public interface IEstadosRepository {
	List<EstadoDTO> findAllestados();
}
