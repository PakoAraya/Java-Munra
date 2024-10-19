package com.basic;

import java.util.Scanner;

public class Bas7 {
  public static void main (String args[]){
    int vector[] = new int [4];
//    vector[0] = 2;
//    vector[1] = 35;
//    vector[2] = 48;
//    vector[3] = 157;

// Asignacion por teclado
    Scanner teclado = new Scanner(System.in);
    for(int i=0; i < vector.length; i++){
      System.out.println("Ingresa el valor para el indice: " + i);
      vector[i] = teclado.nextInt();
    }

    for (int i=0; i < vector.length; i++){
      System.out.println("Estoy en el indice: " + i);
      System.out.println("Tengo almacenado el: "+ vector[i]);
      System.out.println("-------------------------------------");
    }
  }
}
