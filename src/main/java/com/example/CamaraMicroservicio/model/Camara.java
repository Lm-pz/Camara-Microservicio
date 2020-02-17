package com.example.CamaraMicroservicio.model;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Camara implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long camara_id;

	@NotNull 
	private Double ancho_camara;

	@NotNull 
	private Double largo_camara;

	@NotNull 
	private Double temperatura_actual;

	@NotNull 
	@ManyToOne(fetch = FetchType.LAZY)
	private Estado estado;

	@NotNull 
	private Long almacen_id;

	private long producto_id;

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
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Long getAlmacen_id() {
		return almacen_id;
	}

	public void setAlmacen_id(Long almacen_id) {
		this.almacen_id = almacen_id;
	}

	public long getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(long producto_id) {
		this.producto_id = producto_id;
	}





}
