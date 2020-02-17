package com.example.CamaraMicroservicio.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String estado;

	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	private ArrayList<Camara> camaras = new ArrayList<>();

	public Estado() {

	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}



}
