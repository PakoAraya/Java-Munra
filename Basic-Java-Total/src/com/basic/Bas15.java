package com.basic;

import java.util.Scanner;

public class Bas15 {
  public static void main(String args[]){
    //Creamos los 3 vectores para almacenar la informacion
    String ciudades[] = new String[5];
    Double minimas[] = new Double[5];
    Double maximas[] = new Double[5];

    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);

    //Cargar los vectores
    for(int i=0; i < ciudades.length; i++){
      System.out.println("Ingrese el nombre de la ciudad");
      ciudades[i] = teclado.next();
      System.out.println("Ingrese la minima de la ciudad");
      minimas[i] = teclado2.nextDouble();
      System.out.println("Ingrese la maxima de la ciudad");
      maximas[i] = teclado2.nextDouble();
    }

    //Ahora viene la logica del algoritmo
    //Determinar la minima
    Double minima = 9999999.00;
    int posMin = -1;
    for(int i=0; i<ciudades.length; i++){
      if(minimas[i] < minima){
        minima = minimas[i];
        posMin = i;
      }
    }

    Double maxima = -9999999.00;
    int posMax = -1;
    //Determinar la maxima
    for(int i=0; i<ciudades.length; i++){
      if(maximas[i] > maxima){
        maxima = maximas[i];
        posMax = i;
      }
    }
    System.out.println("La temperatura minima es de: " + minima);
    System.out.println("Se registro en la ciudad de: " + ciudades[posMin]);
    System.out.println("La temperatura maxima es de: " + maxima);
    System.out.println("Se registro en la ciudad de: " + ciudades[posMax]);
  }
}
