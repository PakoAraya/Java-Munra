package com.basic;

import java.util.Scanner;

public class Bas9 {
  public static void main(String args[]){
    int vector[] = new int[15];
    int num=3, contador =0;

    Scanner teclado = new Scanner(System.in);
    for (int i=0; i < vector.length; i++){
      System.out.println("Ingresa un numero para la posición: " + i);
      vector[i] = teclado.nextInt();
    }

    //Se recorre el arreglo y se busca el numero
    for (int i=0; i < vector.length; i++){
      if(vector[i] == num){
        //contador = contador + 1;
        contador++;
      }
    }
    for(int i=0; i < vector.length; i++){
      System.out.print(vector[i] + " | ");
    }
    System.out.println("La cantidad de veces que se ingreso el 3 fue de: " + contador);
  }
}
