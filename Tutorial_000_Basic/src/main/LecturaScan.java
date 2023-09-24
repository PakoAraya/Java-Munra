package main;

import java.util.Scanner;

public class LecturaScan {
	public static void main(String[] args) {
    //Primero debemos crear la instancia de scanner
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese tu edad: ");
    int edad = scan.nextInt();
    System.out.println("Yo tambien tengo " + edad + " años");
    System.out.println("¿Cual es tu peso? ");
    double peso = scan.nextDouble();
    System.out.println("Yo peso " + (peso + 5) + " kg");
    System.out.println("¿Cual es tu nombre? ");
    String nombre = scan.next();
    System.out.println("Mi nombre es " + nombre);
  }
}
