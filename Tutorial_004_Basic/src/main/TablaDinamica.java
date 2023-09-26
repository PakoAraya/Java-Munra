package main;

import java.util.Scanner;

public class TablaDinamica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese un número para generar la tabla de multiplicación: ");
    int numero = scan.nextInt();
    int resultado;
    for (int i = 0; i <= 10; i++) {
      resultado = numero * i;
      System.out.println("El resultado de " + numero + " X " + i + " es: " + resultado);
    }

	}

}
