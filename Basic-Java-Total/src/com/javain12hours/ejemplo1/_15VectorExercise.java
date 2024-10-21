package com.javain12hours.ejemplo1;

import java.util.Scanner;

/*
 * Llevar a cabo un programa que incluya un vector que almacene los nombres:
 * Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.
 * Realizar un recorrido del vector para cargar los datos y otro para mostrar
 * los mismos en pantalla.
 */
public class _15VectorExercise {
	public static void main(String[] args) {
		String nombres[] = new String[8];
		Scanner scan = new Scanner(System.in);
		
		//Carga de nombres
		for (int i=0; i<nombres.length; i++) {
			System.out.println("Ingrese el nombre que quiere guardar en el indice " + i);
			nombres[i] = scan.nextLine();
		}
		
		//Muestra de datos
		for (int i=0; i<nombres.length; i++) {
			System.out.println("Indice " + i + " Nombre guardado: " + nombres[i]);
		}
	}
}
