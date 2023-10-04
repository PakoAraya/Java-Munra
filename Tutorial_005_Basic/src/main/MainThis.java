package main;

import java.security.PublicKey;

public class MainThis {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Francesco", "Totti");
		System.out.println("Persona = " + persona1);
		System.out.println("Nombre de persona = " + persona1.nombre);
		System.out.println("Apellido de persona = " + persona1.apellido);
	}
}

class Persona{
	String nombre;
	String apellido;
	
	Persona(String nombre, String apellido){
		//super(); Llamada implicita al constructor de la clase Padre (object).
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("objeto persona usando this " + this);
		new Imprimir().imprimir(this);
	}
	
	class Imprimir {
		
		public Imprimir() {
			super(); //El constructor de la clase object (padre) para reservar memoria.
		}
		
		public void imprimir(Persona persona) {
			System.out.println("Persona desde imprimir: " + persona);
			System.out.println("Impresion del objeto actual (this) " + this);
		}
	}
}
