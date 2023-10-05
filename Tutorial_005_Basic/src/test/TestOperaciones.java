package test;

import java.lang.invoke.VarHandle;

import operaciones.Operaciones;

public class TestOperaciones {
	public static void main(String[] args) {
		var resultado = Operaciones.sumar(8, 4);
		System.out.println("El resultado es: " + resultado);
		
		var resultado2 = Operaciones.sumar(2.0, 3);
		System.out.println("El resultado 2 es: " + resultado2);
		
		var resultado3 = Operaciones.sumar(3, 5L);
		System.out.println("El resultado 3 es: " + resultado3);
	}
	
	
}
