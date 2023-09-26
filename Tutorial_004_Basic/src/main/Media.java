package main;

import java.util.Scanner;

public class Media {  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("================================");
    System.out.println("Calculo de la media");
    System.out.println("================================");
    System.out.println("¿Cuántos valores tienes?");
    int total = scan.nextInt();
    double suma = 0;

    for (int i = 0; i < total; i++) {
      System.out.println("Dar el valor " + (i + 1) + ": ");
      int aux = scan.nextInt();
      suma = aux + suma;
    }
    double media = suma / total;
    System.out.println("El valor de la media es: " + media);
  }
}