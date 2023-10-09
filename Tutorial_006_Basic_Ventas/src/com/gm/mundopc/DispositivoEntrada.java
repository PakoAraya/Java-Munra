package com.gm.mundopc;

public class DispositivoEntrada {
	private String tipoEntrada;
	private String marca;
	
	//Constructo de la clase
	public DispositivoEntrada(String tipoEntrada, String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}
		
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	//Metodo toString
	public String toString() {
		return "Dispositivo de entrada: [Tipo de entrada = " + tipoEntrada + ", Marca " + marca + "]";
	}
}
