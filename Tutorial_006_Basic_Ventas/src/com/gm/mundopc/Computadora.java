package com.gm.mundopc;

import com.gm.mundopc.Monitor;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class Computadora {
	private int idComputadora;
	private String nombre;
	private static int contadorComputadoras;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	
	//Constructor vacio autoincremental
	private Computadora() {
		this.idComputadora = ++Computadora.contadorComputadoras;
	}
	
	//Constructor Completo
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}
	
	//Setters y Getters
	public int getIdComputadora() {
		return idComputadora;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Computadora [nombre = " + nombre + ", monitor = " + monitor + ", teclado = " + teclado + ", raton = " + raton + "]";
	}	
}
