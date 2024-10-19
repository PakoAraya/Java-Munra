package com.basic;

import java.util.Scanner;

//Ejemplo de operadores ternarios
public class Bas5 {
  public static void main(String args[]){
    double promedio;
    String condicionFinal;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el promedio general del alumno de Codelander");
    promedio = teclado.nextDouble();
    condicionFinal = promedio >= 6  ? "Aprobado" : "Reprobado";
    System.out.println("La condicion final del alumno es: " + condicionFinal);
  }
}
