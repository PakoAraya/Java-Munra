package com.javain12hours.ejemplo1;

import java.util.Scanner;

//Hoy repasaremos las matrices
public class _13Matrices {
	public static void main(String[] args) {
		int[][]matrix = new int[3][4];
		Scanner scan = new Scanner(System.in);
		
	//Imprimiendo el tipo de matriz que es
			System.out.println("La cantidad de filas es: " + matrix.length);
			System.out.println("La cantidad de columnas es: " + matrix[0].length);
		
		for (int i=0; i< matrix.length; i++) {
			for (int j=0; j<matrix[0].length; j++) {
				System.out.println("Ingrese el valor para la fila: " + i + " columna: " + j);
				matrix[i][j]= scan.nextInt(); 
			}
		}
		
		//Recorrido de la matriz
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.println("Fila: " + i + " columna: " + j + " valor: " + matrix[i][j]);
			}
		}
	}
}
