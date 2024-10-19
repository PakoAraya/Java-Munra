package com.basic;

import java.util.Scanner;

public class Bas16 {
  public static void main(String args[]){
    int numeros[][] = new int [4][5];
    //Tenemos que llenarlas con numeros 5
    for(int f=0; f < 4; f++){
      for(int c=0; c < 5; c++){
        numeros[f][c] = 5;
      }
    }

    //Ahora lo mostraremos por pantalla
    for(int f=0; f < 4; f++){
      System.out.print("[");
      for(int c=0; c < 5; c++){
        System.out.print(numeros[f][c] + "|");
      }
      System.out.println("]");
    }
  }
}
