package main;

import constructores.PersonaStatic;
import main.Persona.Imprimir;

public class PersonaStaticPrueba {
	public static void main(String[] args) {
		PersonaStatic persona1 = new PersonaStatic("Marcela");
		System.out.println("Persona1: " + persona1);
		
		PersonaStatic persona2 = new PersonaStatic("Karla");
		System.out.println("Persona2: " + persona2);
		
		imprimir(persona1);
		imprimir(persona2);
	}
	
	public static void imprimir(PersonaStatic persona) {
		System.out.println("Persona = " + persona);
	}
}
