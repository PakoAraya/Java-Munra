package main;

import java.util.Scanner;

public class Divisas2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("==========================================");
    System.out.println("Calculadora de Divisas");
    System.out.println("==========================================");
    System.out.println("Opción 1 Dólares a pesos Chilenos");
    System.out.println("Opción 2 Pesos Chilenos a Dólares");

    int opcion = scan.nextInt();
    double monto;
    double peso = 800;
    double conversion;

    switch (opcion) {
      case 1:
      	System.out.println("Ingresa el monto del dinero: ");
        monto = scan.nextDouble();
        conversion = (monto * peso);
        System.out.println("El cambio de dólares a pesos chilenos es: " + conversion);
      break;
      case 2:
      	System.out.println("Ingresa el monto del dinero: ");
        monto = scan.nextDouble();
        conversion = (monto / peso);
        System.out.println("El cambio de pesos chilenos a dólares es: " + conversion);
      break;
      default:
        System.out.println("La opción ingresada no es posible");
    }    
  }
}
