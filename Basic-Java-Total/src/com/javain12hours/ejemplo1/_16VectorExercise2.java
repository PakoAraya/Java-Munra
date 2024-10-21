package com.javain12hours.ejemplo1;

import java.util.Scanner;

/*
 * Realizar un programa que permita la carga de 10 numeros en un vector.
 * Una vez cargados, se necesita que el programa determine cual es el mayor 
 * y cual es el menor de ellos
 */
public class _16VectorExercise2 {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		int num1, num2, aux;
		Scanner scan = new Scanner(System.in);
		
		//Carga del vector
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Ingrese el numero que quiere cargar en la posicion " + i);
			numeros[i] = scan.nextInt();
		}
		
		//Busqueda de numero mayor
		int mayor = Integer.MIN_VALUE;
		for (int i=0; i<numeros.length; i++) {
			if(numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		
		//Busqueda de numero menor
		int menor = Integer.MAX_VALUE;
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		System.out.println("El mayor numero es: " + mayor);
		System.out.println("El menor numero es: " + menor);
	}
}
