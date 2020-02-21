package com.example.CamaraMicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CamaraMicroservicio.model.Estado;



public interface EstadosRepository extends JpaRepository <Estado,String> {

}
