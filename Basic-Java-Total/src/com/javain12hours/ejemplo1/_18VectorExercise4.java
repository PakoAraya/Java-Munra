package com.javain12hours.ejemplo1;

import java.util.Scanner;

/*
 * Un empleado desea almacenar en un vector sus 12 sueldos al anio
 * A partir de esto, necesita un programa que determine y muestre por pantalla
 * la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el anio
 */
public class _18VectorExercise4 {
	public static void main(String[] args) {
		double suma=0, promedio=0;
		double sueldo[] = new double[12];
		Scanner scan = new Scanner(System.in);
		
		//Carga de los sueldos
		for (int i=0; i<sueldo.length; i++) {
			System.out.println("Ingrese el sueldo del mes " + (i + 1));
			sueldo[i] = scan.nextDouble();
		}
		
		//Calculos de la suma de los sueldos
		for (int i=0; i<sueldo.length; i++) {
			suma += sueldo[i];
		}
		promedio = suma/sueldo.length;
		
		//Impresion de la suma y promedio de sueldos
		System.out.println("La suma de todos los sueldos del anio es: " + suma + " dolares");
		System.out.println("El promedio de sueldos del anio es: " + promedio + " dolares");
	}
}
