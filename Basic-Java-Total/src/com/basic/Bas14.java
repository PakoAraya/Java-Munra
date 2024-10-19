package com.basic;

import java.util.Scanner;

public class Bas14 {
  public static void main(String args[]){
    //Pedir datos de la persona dni, nombre y edad
    //Determinar a que categoria se tiene que inscribir
    //Informarle a la persona
    //No sabemos la cantidad de personas que se inscribiran
    //DNI
    System.out.println("Ingrese DNI de la persona");
    Scanner teclado = new Scanner(System.in);
    String dni = teclado.nextLine();
    //Nombre
    System.out.println("Ingrese el nombre de la persona");
    String nombre = teclado.nextLine();
    //Edad
    System.out.println("Ingrese la edad de la persona");
    Scanner teclado2 = new Scanner(System.in);
    int edad = teclado2.nextInt();

    while(!dni.equals("0") && !nombre.equalsIgnoreCase("fin")){
      if(edad >= 6 && edad <= 10){
        System.out.println("La categoria es Menores A");
      } else if (edad >= 11 && edad <= 17) {
        System.out.println("La catgoria es Menores B");
      }else if(edad >= 18 && edad <= 30){
        System.out.println("La categoria es Juveniles");
      } else if (edad >= 31 && edad <= 50) {
        System.out.println("La categoria es adultos");
      } else if (edad >= 51) {
        System.out.println("La categoria es adultos mayores");
      }else{
        System.out.println("La persona no cuenta con la edad indicada");
      }
      //DNI
      System.out.println("Ingrese DNI de la persona");
      dni = teclado.nextLine();
      //Nombre
      System.out.println("Ingrese el nombre de la persona");
      nombre = teclado.nextLine();
      //Edad
      System.out.println("Ingrese la edad de la persona");
      edad = teclado2.nextInt();
    }
  }
}
