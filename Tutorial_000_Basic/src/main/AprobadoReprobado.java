package main;


import java.util.Scanner;

public class AprobadoReprobado {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingrese la calificación: ");
    double calificacion = scan.nextDouble();
    if (calificacion >= 6) {
      System.out.println("Haz Aprobado");
    }
    if(calificacion < 6) {
      System.out.println("Haz Reprobado");
    }
  }
}
