package com.basic;

import java.util.Scanner;

public class Bas19 {
  public static void main(String args[]){
    // Vamos a crear elementos para evaluar numero par o impar
    int numero;
    Scanner scan = new Scanner(System.in);
    System.out.println("App para averiguar numero par o impar");
    System.out.println("Ingrese un numero");
    numero = scan.nextInt();

    if (numero%2 == 0 ){
      System.out.println("El numero es par");
    }else {
      System.out.println("El numero es impar");
    }
  }
}
