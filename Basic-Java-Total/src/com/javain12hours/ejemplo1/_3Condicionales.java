package com.javain12hours.ejemplo1;

import java.util.Scanner;

//Repaso de condicionales
public class _3Condicionales {
  public static void main(String[] args) {
    int edad;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la edad: ");

    edad = teclado.nextInt();

    if (edad > 18) {
      System.out.println("Eres mayor de 18, Felicidades!!!");
      if (edad > 40) {
        System.out.println("Eres generacion X");
      }else {
        System.out.println("Eres Millennial o Centennial");
      }
    }else if(edad == 18){
      System.out.println("Tienes exactamente los 18 ańos, puedes ingresar...");
    } else {
      System.out.println("Lo siento... Eres menor de edad, no puedes ingresar...");
    }
    System.out.println("Ya llegue al final");
  }
}
