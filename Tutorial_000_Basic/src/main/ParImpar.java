package main;


import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {

    System.out.println("Ingrese un numero: ");
    Scanner scan = new Scanner(System.in);
    int numero = scan.nextInt();
    if(numero % 2 == 0) {
      System.out.println("El numero es par");
    } else {
      System.out.println("El numero es impar");
    }
  }
}

