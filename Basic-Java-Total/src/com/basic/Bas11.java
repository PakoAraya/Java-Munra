package com.basic;

import java.util.Scanner;

public class Bas11 {
  public static void main(String args[]){
    int categoria;
    double sueldo=0;

    System.out.println("Ingrese el tipo de empleado: ");
    System.out.println("1- Repositor");
    System.out.println("2- Cajero");
    System.out.println("3- Supervisor");

    Scanner teclado = new Scanner(System.in);
    categoria = teclado.nextInt();

    switch (categoria){
      case 1:
        sueldo = 15890 + (15890*0.10);
        System.out.println("Haz escogido repositor y su sueldo es: " + sueldo);
        break;
      case 2:
        sueldo = 25630.89;
        System.out.println("Haz escogido cajero y su sueldo es: " + sueldo);
        break;
      case 3:
        sueldo = 35560.20 - (35560.20*0.11);
        System.out.println("Haz escogido supervisor y su sueldo es: " + sueldo);
        break;
      default:
        System.out.println("La opción escogida no se encuentra en el menu de opciones");
    }
  }
}
