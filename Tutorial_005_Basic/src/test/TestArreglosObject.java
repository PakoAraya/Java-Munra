package test;

import operaciones.PersonaArray;

public class TestArreglosObject {
	public static void main(String[] args) {
		PersonaArray personas[] = new PersonaArray[2];
		personas[0] = new PersonaArray("Juan");
		personas[1] = new PersonaArray("Karla");
		
		System.out.println("Personas 0 = " + personas[0]);
		System.out.println("Personas 1 = " + personas[1]);
		
		for(int i = 0; i < personas.length; i++) {
			System.out.println("Personas " + i + " "+ personas[i]);
		}
		
		String frutas[] = {"Naranja", "Melon", "Uva"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Frutas = " + frutas[i]);
		}
	}
}
