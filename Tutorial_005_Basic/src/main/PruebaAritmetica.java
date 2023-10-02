package main;

import constructores.Aritmetica;

public class PruebaAritmetica {
	public static void main(String[] args) {
		
		//Variables locales
		int a = 10;
		int b = 2;
		
		Aritmetica aritmetica1 = new Aritmetica();
		System.out.println("Aritmetica1 con valores de a: " + aritmetica1.a);
		System.out.println("Aritmetica1 con valores de b: " + aritmetica1.b);
		Aritmetica aritmetica2 = new Aritmetica(5, 3);
		System.out.println("Aritmetica2 con valores de a: " + aritmetica2.a);
		System.out.println("Aritmetica2 con valores de a: " + aritmetica2.a);
	}
}
