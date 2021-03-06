package com.example.CamaraMicroservicio.model;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Camara implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long camara_id;

	@NotNull 
	private Double ancho_camara;

	@NotNull 
	private Double largo_camara;

	@NotNull 
	private Double temperatura_actual;
	
	@NotNull
	private String nombre_camara;

	@NotNull 
	@ManyToOne(fetch = FetchType.LAZY)
	private Estado miestado;

	@NotNull 
	private Long almacen_id;
	
	private Long ean;
	
	private LocalDate fechaentrada;

	private LocalDate fechasalida;

	public Camara() {

	}

	public Long getCamara_id() {
		return camara_id;
	}

	public void setCamara_id(Long camara_id) {
		this.camara_id = camara_id;
	}

	public Double getAncho_camara() {
		return ancho_camara;
	}

	public void setAncho_camara(Double ancho_camara) {
		this.ancho_camara = ancho_camara;
	}

	public Double getLargo_camara() {
		return largo_camara;
	}

	public void setLargo_camara(Double largo_camara) {
		this.largo_camara = largo_camara;
	}

	public Double getTemperatura_actual() {
		return temperatura_actual;
	}

	public void setTemperatura_actual(Double temperatura_actual) {
		this.temperatura_actual = temperatura_actual;
	}

	public Estado getEstado() {
		return miestado;
	}

	public void setEstado(Estado estado) {
		this.miestado = estado;
	}

	public Long getAlmacen_id() {
		return almacen_id;
	}

	public void setAlmacen_id(Long almacen_id) {
		this.almacen_id = almacen_id;
	}

	public String getNombre_camara() {
		return nombre_camara;
	}

	public void setNombre_camara(String nombre_camara) {
		this.nombre_camara = nombre_camara;
	}

	public Long getEan() {
		return ean;
	}

	public void setEan(Long ean) {
		this.ean = ean;
	}

	public LocalDate getFechaentrada() {
		return fechaentrada;
	}

	public void setFechaentrada(LocalDate fechaentrada) {
		this.fechaentrada = fechaentrada;
	}

	public LocalDate getFechasalida() {
		return fechasalida;
	}

	public void setFechasalida(LocalDate fechasalida) {
		this.fechasalida = fechasalida;
	}

	
	
}
