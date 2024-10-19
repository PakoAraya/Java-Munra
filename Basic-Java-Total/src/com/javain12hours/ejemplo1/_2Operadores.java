package com.javain12hours.ejemplo1;

import java.util.Scanner;

//Repasanso conceptos de operadore
public class _2Operadores {
  public static void main(String[] args) {
    //Declaracion de variables
    Scanner teclado = new Scanner(System.in);
    double num1, num2, suma;

    System.out.println("Ingrese los numeros que quiere sumar... ");
    System.out.println("Ingrese el primero numero para sumar: ");
    num1 = teclado.nextDouble();
    System.out.println("Ingrese el segundo numero para sumar: ");
    num2 = teclado.nextDouble();

    suma = num1 + num2;
    //Pueden ser diferentes operaciones como las siguientes
    //suma = num1 - num2;
    //suma = num1 * num2;
    //suma = num1 / num2;

    System.out.println("El resultado de la suma de los numeros es: " + suma);
  }
}
