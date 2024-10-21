package com.javain12hours.ejemplo1;

import java.util.Scanner;

/*
 * Realizar un programa que permita la carga de 15 numeros en un vector.
 * Una vez cargados, se necesita que el programa cuente e informe por pantalla
 * cuantas veces se cargo el numero 3.
 */
public class _17VectorExercise3 {
	public static void main(String[] args) {
		int numeros[] = new int[15];
		int contador=0;
		Scanner scan = new Scanner(System.in);
		
		//Carga de datos en vector
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Ingrese numero para la posicion " + i);
			numeros[i] = scan.nextInt();
		}
		
		//Contar cuantos numeros 3 hay
		for (int i=0; i<numeros.length; i++) {
			if(numeros[i] ==3) {
				contador++;
			}
		}
		System.out.println("La cantidad de numeros 3 que hay es: " + contador);
	}
}
