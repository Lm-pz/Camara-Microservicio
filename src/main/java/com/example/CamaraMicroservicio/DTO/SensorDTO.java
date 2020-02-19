package com.example.CamaraMicroservicio.DTO;

public class SensorDTO {

	private String numero_serie;

	private String fabricante;
	
	private double temperatura_maxima;
	
	private double temperatura_minima;
	
	private double temperatura_actual;
	
	private double area_medida;

	private long camara_id;

	public SensorDTO() {
		
	}

	public SensorDTO(String numero_serie, String fabricante, double temperatura_maxima, double temperatura_minima,
			double temperatura_actual,	double area_medida, long camara_id) {
		this.numero_serie = numero_serie;
		this.fabricante = fabricante;
		this.temperatura_maxima = temperatura_maxima;
		this.temperatura_minima = temperatura_minima;
		this.temperatura_actual = temperatura_actual;
		this.area_medida = area_medida;
		this.camara_id = camara_id;
	}

	public String getNumero_serie() {
		return numero_serie;
	}

	public void setNumero_serie(String numero_serie) {
		this.numero_serie = numero_serie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getTemperatura_maxima() {
		return temperatura_maxima;
	}

	public void setTemperatura_maxima(double temperatura_maxima) {
		this.temperatura_maxima = temperatura_maxima;
	}

	public double getTemperatura_minima() {
		return temperatura_minima;
	}

	public void setTemperatura_minima(double temperatura_minima) {
		this.temperatura_minima = temperatura_minima;
	}

	public double getArea_medida() {
		return area_medida;
	}

	public void setArea_medida(double area_medida) {
		this.area_medida = area_medida;
	}

	public long getCamara_id() {
		return camara_id;
	}

	public void setCamara_id(long camara_id) {
		this.camara_id = camara_id;
	}

	public double getTemperatura_actual() {
		return temperatura_actual;
	}

	public void setTemperatura_actual(double temperatura_actual) {
		this.temperatura_actual = temperatura_actual;
	}
	
	
	
	
}
