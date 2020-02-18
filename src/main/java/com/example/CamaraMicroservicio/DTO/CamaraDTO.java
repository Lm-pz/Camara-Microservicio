package com.example.CamaraMicroservicio.DTO;

public class CamaraDTO {

	private long camara_id;

	private double ancho_camara;

	private double largo_camara;

	private double temperatura_actual;

	private EstadoDTO estado;

	private long almacen_id;

	private String nombre_camara;

	public CamaraDTO() {

	}

	public CamaraDTO(long camara_id, double ancho_camara, double largo_camara, double temperatura_actual, EstadoDTO estado,
			long almacen_id, String nombre_camara) {

		this.camara_id = camara_id;
		this.ancho_camara = ancho_camara;
		this.largo_camara = largo_camara;
		this.temperatura_actual = temperatura_actual;
		this.estado = estado;
		this.almacen_id = almacen_id;
		this.nombre_camara=nombre_camara;
	}

	public long getCamara_id() {
		return camara_id;
	}

	public void setCamara_id(long camara_id) {
		this.camara_id = camara_id;
	}

	public double getAncho_camara() {
		return ancho_camara;
	}

	public void setAncho_camara(double ancho_camara) {
		this.ancho_camara = ancho_camara;
	}

	public double getLargo_camara() {
		return largo_camara;
	}

	public void setLargo_camara(double largo_camara) {
		this.largo_camara = largo_camara;
	}

	public double getTemperatura_actual() {
		return temperatura_actual;
	}

	public void setTemperatura_actual(double temperatura_actual) {
		this.temperatura_actual = temperatura_actual;
	}

	public EstadoDTO getEstado() {
		return estado;
	}

	public void setEstado(EstadoDTO estado) {
		this.estado = estado;
	}

	public long getAlmacen_id() {
		return almacen_id;
	}

	public void setAlmacen_id(long almacen_id) {
		this.almacen_id = almacen_id;
	}

	public String getNombre_camara() {
		return nombre_camara;
	}

	public void setNombre_camara(String nombre_camara) {
		this.nombre_camara = nombre_camara;
	}



}
