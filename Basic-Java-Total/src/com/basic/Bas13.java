package com.basic;

import java.util.Scanner;

public class Bas13 {
  public static void main(String args[]){
    System.out.println("Ingrese una palabra");
    Scanner teclado = new Scanner(System.in);
    String palabra = teclado.next();

    while (!palabra.equalsIgnoreCase("salir")){
      System.out.println("La palabra es: " + palabra);
      System.out.println("Ingresa otra palabra");
      palabra = teclado.next();
    }
  }
}
