package com.example.CamaraMicroservicio.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Estado implements Serializable {

private static final long serialVersionUID = 1L;

@Id
private String estado;

public Estado() {
	
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}



}
