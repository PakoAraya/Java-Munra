package com.gm.mundopc;

public class Orden {
	private final int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private final static int MAX_COMPUTADORAS = 10;
	
	//Constructor de la clase.
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
	}
	
	//Metodo de agregar computadora
	public void agregarComputadora(Computadora computadora) {
		if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
			this.computadoras[this.contadorComputadoras++] = computadora;
		} else {
			System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
		}
	}
	
	public void mostrarOrden() {
		System.out.println("Orden #: " + this.idOrden);
		System.out.println("Computadoras de la orden #: " + this.idOrden);
//		for (int i = 0; i < computadoras.length; i++) {
//			System.out.println(computadoras[i]);
//		}		
		for(int i=0; i < this.contadorComputadoras; i++) {
			System.out.println(this.computadoras[i]);
		}
	}
	
}
