package com.basic;

import java.util.Scanner;

public class Bas10 {
  public static void main(String args[]){
    Double matriz[][] = new Double[4][4];
    Double prom, nota, suma=0.0;

  // Ingreso de notas por teclado
    Scanner teclado = new Scanner(System.in);
    for(int f=0; f < matriz.length; f++){
      for (int c=0; c < 3; c++){
        System.out.println("Ingrese el alumno n " + f);
        matriz[f][c] = teclado.nextDouble();
        suma = suma + matriz[f][c];
      }
      matriz[f][3] = suma / 3;
      suma = 0.0;
    }

  //Recorrer la matriz
    for (int f=0; f < matriz.length; f++){
      System.out.println("Las notas del alumno n " + f + " son: ");
      for(int c=0; c < 3; c++){
        System.out.println("Nota N: " + c + " " + matriz[f][c]);
      }
      System.out.println("El promedio de las notas es: " + matriz[f][3]);
    }
  }
}
