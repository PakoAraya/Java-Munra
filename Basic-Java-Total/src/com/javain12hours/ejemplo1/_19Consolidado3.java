package com.javain12hours.ejemplo1;

import java.util.Scanner;

/*
 * En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundaria.
 * Cada fila corresponde a las notasd de cada alumno. 																							√
 * Se necesita un programa que permita a un profesor cargar en las 3 primeras posiciones 
 * de cada fila las notas del alumno y que en un vector diferente se calculen los promedios.				√
 * Este vector debe tener la misma cantidad de posiciones que alumnos y coincidir en sus indices.
 * 
 * Una vez realizados los calculos, se desea mostrar las 3 notas de cada alumno y el promedio
 * correspondiente recorriendo la matriz.
 */
public class _19Consolidado3 {
	public static void main(String[] args) {
		double total, promedio;
		double notas[][] = new double[4][3];
		double promedios[] = new double[4];
		Scanner scan = new Scanner(System.in);
		
		//Carga de las notas en la matriz
		for (int i=0; i<notas.length; i++) {
			System.out.println("Ingrese la nota del alumno: " + i);
			for (int j=0; j<notas[0].length; j++) {
				notas[i][j] = scan.nextDouble();
			}
		}
		
		//Calcular los promedios
		for (int i = 0; i < notas.length; i++) {
			total=0;
			for (int j = 0; j < notas[0].length; j++) {
				total = total + notas[i][j];
			}
			promedios[i] = total /notas[0].length; //Aqui se hace todo en un uno, se guarda en el vector apenas calcule promedio
		}
		
		//Mostrar las notas
		System.out.println("-------------------PROMEDIOS--------------------");
		for (int i=0; i<notas.length; i++) {
			System.out.println("\nLas notas del alumno Nº " + (i+1) + " son: ");
			for (int j=0; j<notas[0].length; j++) {
				System.out.println(notas[i][j]);
			}
			System.out.println("El promedio fue de: " + promedios[i]);
			System.out.println("-------------------------------------------------");
		}
	}
}
