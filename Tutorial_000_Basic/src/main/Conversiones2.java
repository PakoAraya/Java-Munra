package main;

import java.util.Scanner;

public class Conversiones2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double valor;
    double centimetro = 2.54;
    double pulgada = 1;

    System.out.println("Calculadora de pulgadas a centimetros ");
    System.out.println("======================================");
    System.out.println("Dar pulgadas");
    valor = scan.nextDouble();

    double resultado = (valor * centimetro) / pulgada;
    System.out.printf("%.2f pulgadas es igual a %.2f centimetros", valor, resultado);
  }
}
