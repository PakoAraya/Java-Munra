package com.javain12hours.ejemplo1;

import java.util.Scanner;

public class _12Arrays {
  public static void main(String[] args) {
    int[] numeros = new int[8];
    Scanner teclado = new Scanner(System.in);

    //Otra forma de declaracion de arreglos cuando ya se su tamaño.
    //int numeros[] = {15,35,22,14,64,61,91,99,32,37};

//    numeros[0] = 15;
//    numeros[1] = 35;
//    numeros[2] = 22;
//    numeros[3] = 14;
//    numeros[4] = 64;
//    numeros[5] = 61;
//    numeros[6] = 91;
//    numeros[7] = 23;

    for (int i=0; i<numeros.length; i++) {
      System.out.println("Ingrese el valor para la posicion: " + i);
      numeros[i] = teclado.nextInt();
    }

    System.out.println("Los valores ingresados fueron: ");
    //for para recorrido de muestra
    for (int i=0; i< numeros.length; i++) {
      System.out.println("Indice: " + i + " valor: " + numeros[i]);
    }
  }
}
