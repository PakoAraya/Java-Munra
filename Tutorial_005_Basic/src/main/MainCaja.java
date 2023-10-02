package main;

import constructores.Caja;

public class MainCaja {
	public static void main(String[] args) {
		//Invocando al constructor vacio
		Caja caja1 = new Caja();
		Caja caja2 = new Caja(3, 2, 6);
		System.out.println("El resultado del volumen de la caja2 es: " + caja2.volumen());
		caja2.volumen();
	}

}
