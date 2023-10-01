package main;

import java.util.Scanner;

public class Conversiones {
	public static void main(String[] args) {
		//Convertir tipo String a Int
		var edad = Integer.parseInt("20");
		System.out.println("Se imprime variable edad: " + (edad + 1));
		
		var valorPI = Double.parseDouble("3.1416");
		System.out.println("El valor de PI es: " + valorPI);
		
		//Pedir un valor
//		var consola = new Scanner(System.in);
//		System.out.println("Proporciona tu edad: ");
//		edad = Integer.parseInt(consola.nextLine());
//		System.out.println("Edad = " + edad);
		
		var edadTexto = String.valueOf(10);
		System.out.println("Imprimiendo edadTexto: " + edadTexto);
		
		var caracter = "hola".charAt(0);
		System.out.println("Devolviendo el valor de variable caracter: " + caracter);
		
//		var consola = new Scanner(System.in);
//		System.out.println("Proporciona un caracter: ");
//		caracter = consola.nextLine().charAt(0);
//		System.out.println("La variable caracter es: " + caracter);

		//Ejemplo de operador ternario
		var resultado = (3>2) ? "verdadero" : "falso";
		System.out.println("El resultado es: " + resultado);
		
		//Otro ejemplo de operador ternario
		var numero = 8;
		resultado = (numero %2 == 0) ? "par" : "impar";
		System.out.println("El numero es: " + resultado);
		
	}
}
