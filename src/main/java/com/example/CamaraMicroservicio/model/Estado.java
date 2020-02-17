package com.example.CamaraMicroservicio.model;
import javax.persistence.*;

import java.io.Serializable;

import java.util.List;

@Entity
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String estado;

	@OneToMany(mappedBy = "miestado",
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	private List<Camara> camaras;

	public Estado() {

	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}



}
