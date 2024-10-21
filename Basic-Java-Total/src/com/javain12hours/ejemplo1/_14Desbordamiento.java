package com.javain12hours.ejemplo1;

//Vamos a explotar un error a proposito para un desbordamiento
public class _14Desbordamiento {

	public static void main(String[] args) {
		int vector[] = new int[3];
		vector[0] = 1;
		vector[1] = 35;
		vector[2] = 23;
		
		//Error por desbordamiento
		//System.out.println("El valor de la tercera posicion es: " + vector[3]);
		
		for (int i=0; i<4; i++) {
			System.out.println("Valor: " + vector[i]);
		}
	}
}
