package com.javain12hours.ejemplo1;

import java.util.Scanner;

public class _10Consolidado3 {
  public static void main(String[] args) {
    String palabra;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Ingrese la palabra que quiera mostrar por teclado: ");
    palabra = teclado.next();

    while (!palabra.equalsIgnoreCase("salir")){
      System.out.println("La palabra es: " + palabra);
      System.out.println("Ingrese la palabra que quiera mostrar por teclado: ");
      palabra = teclado.nextLine();
    }
    System.out.println("Gracias por usar nuestro programa...");
  }
}
