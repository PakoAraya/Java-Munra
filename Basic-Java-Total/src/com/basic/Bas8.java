package com.basic;

import java.util.Scanner;

public class Bas8 {
  public static void main (String args[]){
    int matriz[][] = new int[3][3];
//    matriz[0][0] = 5;
//    matriz[0][1] = 13;
//    matriz[0][2] = 96;
//    matriz[1][0] = 35;
//    matriz[1][1] = 33;
//    matriz[1][2] = 71;
//    matriz[2][0] = 466;
//    matriz[2][1] = 228;
//    matriz[2][2] = 24;

//  Ingreso manual de valores en matriz
    Scanner teclado = new Scanner(System.in);
    for(int f=0; f < matriz.length; f++){
      for(int c=0; c < matriz.length; c++){
        System.out.println("Ingrese el valor de la posicion f: " + f + " c: " + c);
        matriz[f][c] = teclado.nextInt();
      }
    }

    //Ahora la vamos a recorrer
    for(int f=0; f < matriz.length; f++){
      for(int c=0; c< matriz.length; c++){
        System.out.println("El valor es de: "+ matriz[f][c] + " en " +f + " y " +c);
      }
    }
  }
}
