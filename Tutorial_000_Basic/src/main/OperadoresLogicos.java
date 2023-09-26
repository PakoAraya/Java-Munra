package main;


import java.util.Scanner;

public class OperadoresLogicos {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("¿Cuál es tu edad?: ");
    int edad = scan.nextInt();
    if(edad > 0 && edad <= 10){
      System.out.println("Eres un niño");
    }else if(edad >= 11 && edad <= 17){
      System.out.println("Eres un adolescente");
    }else if(edad >= 18 && edad <= 30){
      System.out.println("Eres mayor");
    } else if (edad >= 31 && edad <= 80) {
      System.out.println("Eres un adulto");
    } else if (edad <= 0 || edad > 80) {
      System.out.println("Esa edad no es posible...");
    }

  }
}
