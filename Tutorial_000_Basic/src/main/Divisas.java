package main;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Divisas {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("==========================================");
    System.out.println("Calculadora de Divisas a pesos Chilenos");
    System.out.println("==========================================");

    double cantidad;
    double peso = 800;
    double dolar = 1;

    System.out.println("¿Cuantos dolares tienes?");
    cantidad = scan.nextDouble();
    double resultado = (cantidad * peso) / dolar;  
    System.out.printf("Tienes %.2f dolares y son %.2f pesos chilenos\n", cantidad, resultado);
  }
}
