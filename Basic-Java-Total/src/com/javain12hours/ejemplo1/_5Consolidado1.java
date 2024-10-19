package com.javain12hours.ejemplo1;

import java.util.Scanner;

//Consolidado con lo aprendido
public class _5Consolidado1 {
  public static void main(String[] args){
    //Declaracion de las variables
    int edad;
    Scanner teclado = new Scanner(System.in);

    System.out.println("***** BIENVENIDO A ENGLISH SCHOOL *****");
    System.out.println("Ingrese la edad del alumno: ");
    edad = teclado.nextInt();

    if(edad >= 4 && edad <= 6) {
      System.out.println("El horario del grupo KINDER es, Lunes y Miércoles de 16 a 17 hrs");
    }else if(edad >= 7 && edad <= 8) {
      System.out.println("El horario del grupo 1st year es, Martes y Jueves de 16 a 17 hrs");
    }else if(edad >= 9 && edad <= 10){
      System.out.println("El horario del grupo 2nd year es, Martes y Jueves de 17:30 a 19 hrs");
    }else if(edad >= 11 && edad <= 13){
      System.out.println("El horario del grupo 3rd year es, Lunes y Miércoles de 17 a 18:30 hrs");
    }else{
      System.out.println("Ingreso una edad que no corresponde...");
    }
  }
}
