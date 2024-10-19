package com.javain12hours.ejemplo1;

import java.util.Scanner;

//Revisaremos operadores Ternarios
public class _6Ternarios {
  public static void main(String[] args) {
    //Programa que en base al promedio de un alumno, aprueba una asignatura o no
    //Declaracion de variables
    double promedio;
    String condicionFinal;

    //Pedirle al usuario que ingrese el promedio por teclado
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el promedio del alumno: ");
    promedio = teclado.nextDouble();

    //Aqui se declara el operador ternario.
    condicionFinal = (promedio >= 6.0) ? "Aprobado" : "Reprobado";
    System.out.println("La situacion final del alumno es: " + condicionFinal + " El promedio es: " + promedio);
  }
}
