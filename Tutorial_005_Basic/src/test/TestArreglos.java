package test;

import java.util.concurrent.Delayed;

import main.Estadistica;

public class TestArreglos {
	public static void main(String[] args) {
		int edades[] = new int[3];
		System.out.println("Edades= " + edades);
		
		edades[0] = 10;
		System.out.println("Edades posicion 0 = " + edades[0]);
		
		//Acceder a metodos fuera del arreglo
		//edades[3] = 5; Estadistica asignacion esta fuera del rango del evento.
		
		for(int i=0; i < edades.length; i++) {
			System.out.println("Edades Elemento " + i + ": " + edades[i]);
		}
	}
}
