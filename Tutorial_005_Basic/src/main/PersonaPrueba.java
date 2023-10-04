package main;

import constructores.Persona;

public class PersonaPrueba {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Analissa", "Melchotto", 5000, true);
		persona1.setNombre("Juana Lisa");
//		System.out.println("El nombre de la persona es: " + persona1.getNombre());
//		System.out.println("El apellido de la persona es: " + persona1.getApellido());
//		System.out.println("El sueldo de la persona es: " + persona1.getSueldo());
//		System.out.println("La persona sigue contratada: " + persona1.isEliminado());
		
		//Println invoca automaticamente la funcion toString.
		System.out.println("Persona1: " + persona1.toString());
		System.out.println("Persona1 : " + persona1);
	}
}
