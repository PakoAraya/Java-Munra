package com.gm.mundopc;

public class Monitor {
	private final int idMonitor;
	private String marca;
	private double tamano;
	private static int contadorMonitores;
	
	//Constructor vacio con contador de monitores
	private Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
	}
	
	//Constructor con parametros
	public Monitor(String marca, double tamano) {
		this();
		this.marca = marca;
		this.tamano = tamano;
	}
	
	//Setters y Getters
	public int getIdMonitor() {
		return idMonitor;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	
	public double getTamano() {
		return tamano;
	}
	
	//Funcion toString
	public String toString() {
		return "Monitor [IdMonitor = " + idMonitor + ", Marca = " + marca + ", Tamano = " + tamano + "]";  
	}
}
